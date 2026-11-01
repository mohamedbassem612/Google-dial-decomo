package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycf implements defpackage.ycg {
    private final /* synthetic */ int $cid;

    public ycf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ycg
    public final /* synthetic */ void a(android.media.MediaExtractor mediaExtractor, java.lang.Object obj) throws java.io.IOException {
        int i = this.$cid;
        if (i == 0) {
            mediaExtractor.setDataSource(new defpackage.yce(this, (java.nio.ByteBuffer) obj));
        } else if (i != 1) {
            mediaExtractor.setDataSource(((android.os.ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            android.content.res.AssetFileDescriptor assetFileDescriptor = (android.content.res.AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @Override // defpackage.ycg
    public final /* synthetic */ void b(android.media.MediaMetadataRetriever mediaMetadataRetriever, java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new defpackage.yce(this, (java.nio.ByteBuffer) obj));
        } else if (i != 1) {
            mediaMetadataRetriever.setDataSource(((android.os.ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            android.content.res.AssetFileDescriptor assetFileDescriptor = (android.content.res.AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }
}
