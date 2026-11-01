package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvt implements defpackage.xvu {
    private static final java.lang.String[] a = {"_data"};
    private final android.content.ContentResolver b;

    public xvt(android.content.ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.xvu
    public final android.database.Cursor a(android.net.Uri uri) {
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        return this.b.query(android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND video_id = ?", new java.lang.String[]{lastPathSegment}, null);
    }
}
