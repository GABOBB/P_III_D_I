import { AppBar, Toolbar, Typography } from "@mui/material";
import { Box } from "@mui/system";
import { Fragment } from "react";
import ChatIcon from '@mui/icons-material/Chat';

export default function Bar() {
    return (
        <Fragment>
            <Box mb={4}>
                <AppBar position="static">
                    <Toolbar>
                        <Box mr={2}>
                            <ChatIcon fontSize={'large'}/>
                        </Box>
                        <Typography variant="h6">
                            Proyecto III Algoritmos y estructuras de Datos I
                        </Typography>
                    </Toolbar>
                </AppBar>
            </Box>
        </Fragment>
    )
}