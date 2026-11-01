package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adsc extends defpackage.adrl {
    private j$.util.Optional c;

    public adsc(int i, defpackage.adpf adpfVar) throws java.io.IOException {
        this.c = j$.util.Optional.empty();
        android.media.AudioFormat audioFormatBuild = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(16).setSampleRate(i).build();
        defpackage.afpl afplVarA = adpfVar.a(audioFormatBuild);
        try {
            afplVarA.p();
        } catch (java.lang.IllegalStateException unused) {
        }
        for (int i2 = 1; afplVarA.m() != 3 && i2 < 3; i2++) {
            afplVarA.o();
            afplVarA = adpfVar.a(audioFormatBuild);
            try {
                afplVarA.p();
            } catch (java.lang.IllegalStateException unused2) {
            }
        }
        if (afplVarA.m() != 3) {
            afplVarA.o();
            throw new java.io.IOException("Could not start recording.");
        }
        this.c = j$.util.Optional.of(afplVarA);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.adrl
    protected final int a(byte[] bArr, int i, int i2) {
        if (this.c.isEmpty()) {
            return -1;
        }
        defpackage.afpl afplVar = (defpackage.afpl) this.c.get();
        int i3 = ((android.media.AudioRecord) afplVar.b).read(bArr, i, i2);
        java.util.Iterator it = afplVar.a.iterator();
        while (it.hasNext()) {
            ((defpackage.adpg) it.next()).b(afplVar, bArr, i, i3);
        }
        return i3;
    }

    @Override // defpackage.adrl
    public final boolean b() {
        return this.c.isPresent();
    }

    @Override // defpackage.adrl, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
        synchronized (this) {
            if (this.c.isPresent()) {
                java.lang.Object obj = this.c.get();
                ((defpackage.afpl) obj).q();
                ((defpackage.afpl) obj).o();
                this.c = j$.util.Optional.empty();
            }
        }
    }
}
