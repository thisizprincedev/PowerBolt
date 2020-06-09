package com.mobicomly.powerbolt.parameter;

public class ErrorCodeToMsg {
    public static final String ErrCodeToMsg = "{  \"9000\": \"XL_NO_ERRNO                 \"  ,  \"9101\": \"XL_ALREADY_INIT             \"  ,  \"9102\": \"XL_SDK_NOT_INIT             \"  ,  \"9103\": \"XL_TASK_ALREADY_EXIST       \"  ,  \"9104\": \"XL_TASK_NOT_EXIST           \"  ,  \"9105\": \"XL_TASK_ALREADY_STOPPED     \"  ,  \"9106\": \"XL_TASK_ALREADY_RUNNING     \"  ,  \"9107\": \"XL_TASK_NOT_START           \"  ,  \"9108\": \"XL_TASK_STILL_RUNNING       \"  ,  \"9109\": \"XL_FILE_EXISTED             \"  ,  \"9110\": \"XL_DISK_FULL                \"  ,  \"9111\": \"XL_TOO_MUCH_TASK            \"  ,  \"9112\": \"XL_PARAM_ERROR              \"  ,  \"9113\": \"XL_SCHEMA_NOT_SUPPORT       \"  ,  \"9114\": \"XL_DYNAMIC_PARAM_FAIL       \"  ,  \"9115\": \"XL_CONTINUE_NO_NAME         \"  ,  \"9116\": \"XL_APPNAME_APPKEY_ERROR     \"  ,  \"9117\": \"XL_CREATE_THREAD_ERROR      \"  ,  \"9118\": \"XL_TASK_FINISH              \"  ,  \"9119\": \"XL_TASK_NOT_RUNNING         \"  ,  \"9120\": \"XL_TASK_NOT_IDLE            \"  ,  \"9121\": \"XL_TASK_TYPE_NOT_SUPPORT    \"  ,  \"9122\": \"XL_ADD_RESOURCE_ERROR       \"  ,  \"9123\": \"XL_TASK_LOADING_CFG         \"  ,  \"9301\": \"XL_NO_ENOUGH_BUFFER         \"  ,  \"9302\": \"XL_TORRENT_PARSE_ERROR      \"  ,  \"9303\": \"XL_INDEX_NOT_READY          \"  ,  \"9304\": \"XL_TORRENT_IMCOMPLETE       \"  ,  \"9900\": \"DOWNLOAD_MANAGER_ERROR      \"  ,  \"9901\": \"APPKEY_CHECKER_ERROR        \"  ,  \"111024\": \"COMMON_ERRCODE_BASE                \"  ,  \"111025\": \"TARGET_THREAD_STOPING              \"  ,  \"111026\": \"OUT_OF_MEMORY                      \"  ,  \"111031\": \"TASK_USE_TOO_MUCH_MEM              \"  ,  \"111032\": \"OUT_OF_FIXED_MEMORY                \"  ,  \"111033\": \"QUEUE_NO_ROOM                      \"  ,  \"111035\": \"MAP_UNINIT                         \"  ,  \"111036\": \"MAP_DUPLICATE_KEY                  \"  ,  \"111037\": \"MAP_KEY_NOT_FOUND                  \"  ,  \"111038\": \"INVALID_ITERATOR                   \"  ,  \"111039\": \"BUFFER_OVERFLOW                    \"  ,  \"111041\": \"INVALID_ARGUMENT                   \"  ,  \"111048\": \"INVALID_SOCKET_DESCRIPTOR          \"  ,  \"111050\": \"ERROR_INVALID_INADDR               \"  ,  \"111181\": \"REDIRECT_TOO_MUCH                  \"  ,  \"111057\": \"NOT_IMPLEMENT                      \"  ,  \"111074\": \"INVALID_TIMER_INDEX                \"  ,  \"111078\": \"DNS_INVALID_ADDR                   \"  ,  \"111083\": \"BAD_DIR_PATH                       \"  ,  \"111084\": \"FILE_CANNOT_TRUNCATE               \"  ,  \"111085\": \"INSUFFICIENT_DISK_SPACE            \"  ,  \"111086\": \"FILE_TOO_BIG                       \"  ,  \"111118\": \"DISPATCHER_ERRCODE_BASE            \"  ,  \"111119\": \"DATA_MGR_ERRCODE_BASE              \"  ,  \"111120\": \"ALLOC_INVALID_SIZE                 \"  ,  \"111121\": \"DATA_BUFFER_IS_FULL                \"  ,  \"111122\": \"BLOCK_NO_INVALID                   \"  ,  \"111123\": \"CHECK_DATA_BUFFER_NOT_ENOUG        \"  ,  \"111124\": \"BCID_CHECK_FAIL                    \"  ,  \"111125\": \"BCID_ONCE_CHECT_TOO_MUCH           \"  ,  \"111126\": \"READ_FILE_ERR                      \"  ,  \"111127\": \"WRITE_FILE_ERR                     \"  ,  \"111128\": \"OPEN_FILE_ERR                      \"  ,  \"111129\": \"FILE_PATH_TOO_LONG                 \"  ,  \"111130\": \"SD_INVALID_FILE_SIZE               \"  ,  \"111131\": \"FILE_CFG_MAGIC_ERROR               \"  ,  \"111132\": \"FILE_CFG_READ_ERROR                \"  ,  \"111133\": \"FILE_CFG_WRITE_ERROR               \"  ,  \"111134\": \"FILE_CFG_READ_HEADER_ERROR         \"  ,  \"111135\": \"FILE_CFG_RESOLVE_ERROR             \"  ,  \"111136\": \"TASK_FAILURE_NO_DATA_PIPE          \"  ,  \"111137\": \"NO_FILE_NAME                       \"  ,  \"111138\": \"CANNOT_GET_FILE_NAME               \"  ,  \"111139\": \"CREATE_FILE_FAIL                   \"  ,  \"111140\": \"OPEN_OLD_FILE_FAIL                 \"  ,  \"111141\": \"FILE_SIZE_NOT_BELIEVE              \"  ,  \"111142\": \"FILE_SIZE_TOO_SMALL                \"  ,  \"111143\": \"FILE_NOT_EXIST                     \"  ,  \"111144\": \"FILE_INVALID_PARA                  \"  ,  \"111145\": \"FILE_CREATING                      \"  ,  \"111146\": \"FIL_INFO_INVALID_DATA              \"  ,  \"111147\": \"FIL_INFO_RECVED_DATA               \"  ,  \"111159\": \"CONF_MGR_ERRCODE_BASE              \"  ,  \"111160\": \"SETTINGS_ERR_UNKNOWN               \"  ,  \"111161\": \"SETTINGS_ERR_INVALID_FILE_NAME     \"  ,  \"111162\": \"SETTINGS_ERR_CFG_FILE_NOT_EXIST    \"  ,  \"111163\": \"SETTINGS_ERR_INVALID_LINE          \"  ,  \"111164\": \"SETTINGS_ERR_INVALID_ITEM_NAME     \"  ,  \"111165\": \"SETTINGS_ERR_INVALID_ITEM_VALUE    \"  ,  \"111166\": \"SETTINGS_ERR_LIST_EMPTY            \"  ,  \"111167\": \"SETTINGS_ERR_ITEM_NOT_FOUND        \"  ,  \"111168\": \"NET_REACTOR_ERRCODE_BASE           \"  ,  \"111169\": \"NET_CONNECT_SSL_ERR                \"  ,  \"111170\": \"NET_BROKEN_PIPE                    \"  ,  \"111171\": \"NET_CONNECTION_REFUSED             \"  ,  \"111172\": \"NET_SSL_GET_FD_ERROR               \"  ,  \"111173\": \"NET_OP_CANCEL                      \"  ,  \"111174\": \"NET_UNKNOWN_ERROR                  \"  ,  \"111175\": \"NET_NORMAL_CLOSE                   \"  ,  \"111176\": \"TASK_FAIL_LONG_TIME_NO_RECV_DATA   \"  ,  \"111177\": \"TASK_FILE_SIZE_TOO_LARGE           \"  ,  \"111178\": \"TASK_RETRY_ALWAY_FAIL              \"  ,  \"111300\": \"ASYN_FILE_E_BASE                   \"  ,  \"111301\": \"ASYN_FILE_E_OP_NONE                \"  ,  \"111302\": \"ASYN_FILE_E_OP_BUSY                \"  ,  \"111303\": \"ASYN_FILE_E_FILE_NOT_OPEN          \"  ,  \"111304\": \"ASYN_FILE_E_FILE_REOPEN            \"  ,  \"111305\": \"ASYN_FILE_E_EMPTY_FILE             \"  ,  \"111306\": \"ASYN_FILE_E_FILE_SIZE_LESS         \"  ,  \"111307\": \"ASYN_FILE_E_TOO_MUCH_DATA          \"  ,  \"111308\": \"ASYN_FILE_E_FILE_CLOSING           \"  ,  \"112400\": \"ERR_PTL_PROTOCOL_NOT_SUPPORT       \"  ,  \"112500\": \"ERR_PTL_PEER_OFFLINE               \"  ,  \"112600\": \"ERR_PTL_GET_PEERSN_FAILED          \"  ,  \"11300\": \"P2P_PIPE_ERRCODE_BASE\t\t\t    \"  ,  \"11301\": \"ERR_P2P_VERSION_NOT_SUPPORT\t\t    \"  ,  \"11302\": \"ERR_P2P_WAITING_CLOSE\t\t\t    \"  ,  \"11303\": \"ERR_P2P_HANDSHAKE_RESP_FAIL\t\t    \"  ,  \"11304\": \"ERR_P2P_REQUEST_RESP_FAIL\t\t    \"  ,  \"11305\": \"ERR_P2P_UPLOAD_OVER_MAX\t\t\t    \"  ,  \"11306\": \"ERR_P2P_REMOTE_UNKNOWN_MY_CMD\t    \"  ,  \"11307\": \"ERR_P2P_NOT_SUPPORT_UDT\t\t\t    \"  ,  \"11308\": \"ERR_P2P_BROKER_CONNECT\t\t\t    \"  ,  \"11309\": \"ERR_P2P_INVALID_COMMAND\t\t\t    \"  ,  \"11310\": \"ERR_P2P_INVALID_PARAM\t\t\t    \"  ,  \"11311\": \"ERR_P2P_CONNECT_FAILED\t\t\t    \"  ,  \"11312\": \"ERR_P2P_CONNECT_UPLOAD_SLOW\t        \"  ,  \"11313\": \"ERR_P2P_ALLOC_MEM_ERR               \"  ,  \"11314\": \"ERR_P2P_SEND_HANDSHAKE              \"  ,  \"114001\": \"TASK_FAILURE_QUERY_EMULE_HUB_FAILED\"  ,  \"114101\": \"TASK_FAILURE_EMULE_NO_RECORD       \"  ,  \"114002\": \"TASK_FAILURE_SUBTASK_FAILED        \"  ,  \"114003\": \"TASK_FAILURE_CANNOT_START_SUBTASK  \"  ,  \"114004\": \"TASK_FAILURE_QUERY_BT_HUB_FAILED   \"  ,  \"114005\": \"TASK_FAILURE_PARSE_TORRENT_FAILED  \"  ,  \"114006\": \"TASK_FAILURE_GET_TORRENT_FAILED    \"  ,  \"114007\": \"TASK_FAILURE_SAVE_TORRENT_FAILED   \"  ,  \"115000\": \"RES_QUERY_E_BASE                   \"  ,  \"115100\": \"HTTP_HUB_CLIENT_E_BASE             \"  ,  \"116000\": \"IP6_ERRCODE_BASE                   \"  ,  \"116001\": \"ERR_INVALID_ADDRESS_FAMILY         \"  ,  \"116002\": \"IP6_INVALID_IN6ADDR                \"  ,  \"116003\": \"IP6_NOT_SUPPORT_SSL                \"  ,  \"117000\": \"PAUSE_TASK_WRITE_CFG_ERR           \"  ,  \"117001\": \"PAUSE_TASK_WRITE_DATA_TIMEOUT      \"   }";
}