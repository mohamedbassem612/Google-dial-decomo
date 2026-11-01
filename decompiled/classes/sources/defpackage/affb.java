package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class affb extends defpackage.affe implements defpackage.afen, defpackage.afem {
    private final java.io.FileInputStream a;
    private final java.io.File b;

    public affb(java.io.FileInputStream fileInputStream, java.io.File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.afem
    public final java.nio.channels.FileChannel a() {
        return j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.afen
    public final java.io.File c() {
        return this.b;
    }
}
