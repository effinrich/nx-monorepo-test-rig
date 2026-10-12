package com.acmehealth.company.api.client.file;

import com.acmehealth.company.api.entity.ref.PersonRef;
import com.acmehealth.company.api.exception.GoogleDriveException;
import java.util.Optional;

public interface GoogleDriveClient extends RemoteFileClient {
  String createFolder(String folderName);

  String createFolder(String folderName, String parentId);

  Optional<String> getFolder(String folderName);

  String copy(String fileId, String destinationFolderId);

  boolean canEdit(String fileId);

  void grantEditAccess(String fileId, PersonRef personRef);

  void revokeAccess(String fileId, PersonRef personRef);

  void deleteFolder(String folderId) throws GoogleDriveException;
}
