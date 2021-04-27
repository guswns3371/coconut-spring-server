package com.coconut.client.dto.res;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@Getter
public class ChatRoomSaveResDto {

    /**
     *     @SerializedName("chatRoomId") var chatRoomId : String,
     *     @SerializedName("chatRoomName") var chatRoomName : String,
     *     @SerializedName("chatRoomMembers") var chatRoomMembers : String,
     *     @SerializedName("chatRoomMembersInfo") var chatRoomMembersInfo : ArrayList<UserDataResponse>
     */

    private String chatRoomId;
    private String chatRoomName;
    private ArrayList<String> chatRoomMembers;
    private ArrayList<UserDataResDto> chatRoomMembersInfo;

    @Builder
    public ChatRoomSaveResDto(String chatRoomId, String chatRoomName, ArrayList<String> chatRoomMembers, ArrayList<UserDataResDto> chatRoomMembersInfo) {
        this.chatRoomId = chatRoomId;
        this.chatRoomName = chatRoomName;
        this.chatRoomMembers = chatRoomMembers;
        this.chatRoomMembersInfo = chatRoomMembersInfo;
    }

}
