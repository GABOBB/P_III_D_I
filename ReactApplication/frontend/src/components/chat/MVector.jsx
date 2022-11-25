import {  useEffect, useRef, useState } from "react";
import Button from '@mui/material/Button';
import { ServerMessageDto } from "../../model/ServerMessageDto";
import './Mvector.css'
import Stack from '@mui/material/Stack';
export default function MVector() {

    const webSocket = useRef(null);
    const [id, information] = useState('');
    const [setMessage] = useState('');

    const WebSocket = useRef(null);


    useEffect(() => {
        console.log('Opening WebSocket');
        webSocket.current = new WebSocket('ws://localhost:8080/chat');
        const openWebSocket = () => {
            webSocket.current.onopen = (event) => {
                console.log('Open:', event);
            }
            webSocket.current.onclose = (event) => {
                console.log('Close:', event);
            }
        }
        openWebSocket();
        return () => {
            console.log('Closing WebSocket');
            webSocket.current.close();
        }
    }, []);

    useEffect(() =>  {
        webSocket.current.onnmessage = (event) => {
            const ServerMessageDto = JSON.parse(event);
            console.log("Message: ", ServerMessageDto);
        }
    });

    const sendMessage = () => {
        console.log('Send!');
        webSocket.current.send(
            JSON.stringify(new ServerMessageDto(id, information))
            );
            setMessage("");
    }
    return (
      <Stack direction="row" alignItems="center" spacing={2}>
        <Button variant="contained" component="label" onClick = {sendMessage}>
          Button
        </Button>
      </Stack>

);
    
}
