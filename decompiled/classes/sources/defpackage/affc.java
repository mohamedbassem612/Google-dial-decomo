package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class affc extends defpackage.afff implements defpackage.afen, defpackage.afem, defpackage.afez {
    private final java.io.FileOutputStream a;
    private final java.io.File b;

    public affc(java.io.FileOutputStream fileOutputStream, java.io.File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.afem
    public final java.nio.channels.FileChannel a() {
        return j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.afez
    public final void b() throws java.io.SyncFailedException {
        this.a.getFD().sync();
    }

    @Override // defpackage.afen
    public final java.io.File c() {
        return this.b;
    }
}
