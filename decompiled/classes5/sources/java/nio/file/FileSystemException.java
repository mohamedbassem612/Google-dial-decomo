package java.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class FileSystemException extends java.io.IOException {
    private final java.lang.String a;
    private final java.lang.String b;

    public FileSystemException(java.lang.String str) {
        super((java.lang.String) null);
        this.a = str;
        this.b = null;
    }

    public java.lang.String getFile() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        if (this.a == null && this.b == null) {
            return getReason();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a != null) {
            sb.append(this.a);
        }
        if (this.b != null) {
            sb.append(" -> ");
            sb.append(this.b);
        }
        if (getReason() != null) {
            sb.append(": ");
            sb.append(getReason());
        }
        return sb.toString();
    }

    public java.lang.String getOtherFile() {
        return this.b;
    }

    public java.lang.String getReason() {
        return super.getMessage();
    }

    public FileSystemException(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str3);
        this.a = str;
        this.b = str2;
    }
}
