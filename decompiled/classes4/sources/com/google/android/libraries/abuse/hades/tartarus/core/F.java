package com.google.android.libraries.abuse.hades.tartarus.core;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
@com.google.android.apps.common.proguard.UsedByNative
public final class F extends abbe {
    /* JADX WARN: Illegal instructions before constructor call */
    @com.google.android.apps.common.proguard.UsedByNative
    private F(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        defpackage.alez alezVar;
        defpackage.aley aleyVar;
        switch (i) {
            case 0:
                alezVar = defpackage.alez.OK;
                break;
            case 1:
                alezVar = defpackage.alez.INITIALIZATION_IN_PROGRESS;
                break;
            case 2:
                alezVar = defpackage.alez.INITIALIZATION_FAILED;
                break;
            case 3:
                alezVar = defpackage.alez.MODEL_NOT_FOUND;
                break;
            case 4:
                alezVar = defpackage.alez.MALFORMED_MODEL_METADATA;
                break;
            case 5:
                alezVar = defpackage.alez.TARTARUS_OUTPUT_CONVERSION_FAILED;
                break;
            case 6:
                alezVar = defpackage.alez.TARTARUS_OUTPUT_NO_VERDICT;
                break;
            case 7:
                alezVar = defpackage.alez.TARTARUS_OUTPUT_UNKNOWN_ACTION;
                break;
            case 8:
                alezVar = defpackage.alez.TARTARUS_CORE_LOAD_ERROR;
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                alezVar = defpackage.alez.TARTARUS_CORE_CLASSIFY_ERROR;
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                alezVar = defpackage.alez.UNKNOWN_ERROR;
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                alezVar = defpackage.alez.TARTARUS_VM_LOAD_ERROR;
                break;
            case 12:
                alezVar = defpackage.alez.TARTARUS_VM_CLASSIFY_ERROR;
                break;
            case 13:
                alezVar = defpackage.alez.PERSEPHONE_DOWNLOAD_FAILED;
                break;
            case 14:
                alezVar = defpackage.alez.LOAD_PROTECTIONS_FAILED;
                break;
            case 15:
                alezVar = defpackage.alez.MDD_READ_FILE_FAILED;
                break;
            case 16:
                alezVar = defpackage.alez.MDD_PROTECTION_EXTRACTION_FAILED;
                break;
            case 17:
                alezVar = defpackage.alez.TARTARUS_CORE_ILLEGAL_ARGUMENT_ERROR;
                break;
            case 18:
                alezVar = defpackage.alez.PERSEPHONE_DOWNLOAD_FAILED_MDD;
                break;
            default:
                alezVar = null;
                break;
        }
        defpackage.alez alezVar2 = alezVar == null ? defpackage.alez.UNKNOWN_ERROR : alezVar;
        switch (i2) {
            case 0:
                aleyVar = defpackage.aley.ERROR_MESSAGE_UNSPECIFIED;
                break;
            case 1:
                aleyVar = defpackage.aley.CLASSIFICATION_BEFORE_INITIALIZATION;
                break;
            case 2:
                aleyVar = defpackage.aley.NO_PROTECTIONS_FOUND_ON_DISK;
                break;
            case 3:
                aleyVar = defpackage.aley.NO_PROTECTIONS_FOUND_AFTER_UPDATE;
                break;
            case 4:
                aleyVar = defpackage.aley.PERSEPHONE_DOWNLOAD_NOT_ENABLED;
                break;
            case 5:
                aleyVar = defpackage.aley.SERVICE_SPECIFIC_EXCEPTION;
                break;
            case 6:
                aleyVar = defpackage.aley.VM_RESET;
                break;
            case 7:
                aleyVar = defpackage.aley.FATAL_VM_ERROR;
                break;
            case 8:
                aleyVar = defpackage.aley.FAIL_CONVERT_TARTARUS_DATA_TO_VERDICT;
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                aleyVar = defpackage.aley.TARTARUS_OUTPUT_UNKNOWN_ACTION_CONVERSION_FAILED;
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                aleyVar = defpackage.aley.CLASSIFICATION_RESPONSE_TARTARUS_OUTPUT_NO_VERDICT;
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                aleyVar = defpackage.aley.JNI_CLASSIFY_TARTARUS_OUTPUT_NO_VERDICT;
                break;
            case 12:
                aleyVar = defpackage.aley.JNI_BATCH_CLASSIFY_TARTARUS_OUTPUT_NO_VERDICT;
                break;
            case 13:
                aleyVar = defpackage.aley.TARTARUS_OUTPUT_NO_VERDICT_CONVERSION_FAILED;
                break;
            case 14:
                aleyVar = defpackage.aley.CLASSIFICATION_IS_DISABLED;
                break;
            case 15:
                aleyVar = defpackage.aley.RUNTIME_CLOSED_PREVIOUSLY_SINGLE_RUN;
                break;
            case 16:
                aleyVar = defpackage.aley.RUNTIME_CLOSED_PREVIOUSLY_BATCH_RUN;
                break;
            case 17:
                aleyVar = defpackage.aley.INITIALIZE_FAIL_EMPTY_REQUEST;
                break;
            case 18:
                aleyVar = defpackage.aley.SINGLE_CLASSIFY_EMPTY_REQUEST;
                break;
            case 19:
                aleyVar = defpackage.aley.BATCH_CLASSIFY_EMPTY_REQUEST;
                break;
            case 20:
                aleyVar = defpackage.aley.INITIALIZE_FAIL_MALFORMED_REQUEST;
                break;
            case 21:
                aleyVar = defpackage.aley.SINGLE_CLASSIFY_MALFORMED_REQUEST;
                break;
            case 22:
                aleyVar = defpackage.aley.BATCH_CLASSIFY_MALFORMED_REQUEST;
                break;
            case 23:
                aleyVar = defpackage.aley.SINGLE_CLASSIFY_SERVICE_IS_NULL;
                break;
            case 24:
                aleyVar = defpackage.aley.BATCH_CLASSIFY_SERVICE_IS_NULL;
                break;
            case 25:
                aleyVar = defpackage.aley.SINGLE_CLASSIFY_ENTITY_ID_IS_NULL;
                break;
            case 26:
                aleyVar = defpackage.aley.BATCH_CLASSIFY_ENTITY_ID_IS_NULL;
                break;
            case 27:
                aleyVar = defpackage.aley.MDD_GET_FILE_GROUP_FAILED;
                break;
            case 28:
                aleyVar = defpackage.aley.MDD_PROTECTION_EXTRACTION_FAILED_ERROR;
                break;
            case 29:
                aleyVar = defpackage.aley.TARTARUS_CORE_UNKNOWN_ERROR;
                break;
            case 30:
                aleyVar = defpackage.aley.NO_ERROR_MESSAGE;
                break;
            case 31:
                aleyVar = defpackage.aley.UNKNOWN_EXCEPTION_DURING_DOWNLOAD;
                break;
            case 32:
                aleyVar = defpackage.aley.PERSEPHONE_SYNC_FAILED;
                break;
            case 33:
                aleyVar = defpackage.aley.SECURE_SERVICE_NOT_AVAILABLE;
                break;
            case 34:
                aleyVar = defpackage.aley.MDD_INITIALIZATION_FAILED;
                break;
            case 35:
                aleyVar = defpackage.aley.INITIALIZATION_FAILED_PROTECTION_LOADING_FAILURE;
                break;
            case 36:
                aleyVar = defpackage.aley.INITIALIZATION_ALREADY_IN_PROGRESS;
                break;
            case 37:
                aleyVar = defpackage.aley.INITIALIZATION_MISSING_CLIENT_ROLE_CONFIG;
                break;
            case 38:
                aleyVar = defpackage.aley.INTEGRITY_CHECK_FAILED_MINT_TOKEN_ERROR;
                break;
            case 39:
                aleyVar = defpackage.aley.INTEGRITY_CHECK_FAILED_REQUIREMENTS_INITIALIZATION_ERROR;
                break;
            case 40:
                aleyVar = defpackage.aley.GET_ENCRYPTION_KEY_FAILED;
                break;
            case 41:
                aleyVar = defpackage.aley.MDD_GET_MANIFEST_FAILED;
                break;
            case 42:
                aleyVar = defpackage.aley.MDD_GET_MANIFEST_FAILED_CANCELED;
                break;
            case 43:
                aleyVar = defpackage.aley.MDD_GET_MANIFEST_FAILED_NOT_FOUND;
                break;
            case 44:
                aleyVar = defpackage.aley.MDD_GET_MANIFEST_FAILED_PERMISSION_DENIED;
                break;
            case 45:
                aleyVar = defpackage.aley.MDD_GET_MANIFEST_FAILED_UNAVAILABLE;
                break;
            case 46:
                aleyVar = defpackage.aley.INITIALIZATION_FAILED_TIMEOUT_AWAITING_WORK_MANAGER_DOWNLOAD;
                break;
            case 47:
                aleyVar = defpackage.aley.MDD_PROTECTIONS_DOWNLOAD_FAILED;
                break;
            case 48:
                aleyVar = defpackage.aley.MDD_DOWNLOAD_OBSERVER_TIMED_OUT;
                break;
            case 49:
                aleyVar = defpackage.aley.MDD_REFRESH_MANIFEST_FAILED_UNKNOWN_EXCEPTION;
                break;
            case 50:
                aleyVar = defpackage.aley.MDD_ADD_FILE_GROUP_FAILED_UNKNOWN_EXCEPTION;
                break;
            case 51:
                aleyVar = defpackage.aley.MDD_MANIFEST_CONFIG_OVERRIDER_FAILURE;
                break;
            case 52:
                aleyVar = defpackage.aley.DECRYPTION_FAILED_UNKNOWN_EXCEPTION;
                break;
            case 53:
            default:
                aleyVar = null;
                break;
            case 54:
                aleyVar = defpackage.aley.MDD_GET_MANIFEST_FAILED_INTEGRITY_CHECK;
                break;
            case 55:
                aleyVar = defpackage.aley.NO_VERDICT_ALL_RULES_FAILED_SILENT_FAILURE;
                break;
        }
        super(alezVar2, aleyVar == null ? defpackage.aley.TARTARUS_CORE_UNKNOWN_ERROR : aleyVar, str, (java.lang.Throwable) null, (akzc) null, 0L, (abay) null, 120);
        java.util.List<java.lang.String> listR = aoov.R(str4, new char[]{';'});
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listR, 10));
        for (java.lang.String str5 : listR) {
            java.util.List listR2 = aoov.R(str5, new char[]{':'});
            java.lang.Integer numO = listR2.size() == 2 ? aoov.o((java.lang.String) listR2.get(1)) : null;
            arrayList.add(numO != null ? new java.lang.StackTraceElement(str2, str3, (java.lang.String) listR2.get(0), numO.intValue()) : new java.lang.StackTraceElement(str2, str3, str5, -1));
        }
        setStackTrace((java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[0]));
    }

    public F(defpackage.alez alezVar, defpackage.aley aleyVar) {
        super(alezVar, aleyVar, "runtime has been previously closed", (java.lang.Throwable) null, (akzc) null, 0L, (abay) null, 120);
    }
}
