package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adgk {
    public byte[] a;
    private defpackage.aift b;
    private defpackage.aify c;
    private boolean d;
    private byte e;

    public final com.google.android.libraries.micore.superpacks.SlicingResult a() {
        defpackage.aift aiftVar = this.b;
        if (aiftVar != null) {
            this.c = aiftVar.g();
        } else if (this.c == null) {
            this.c = defpackage.aike.a;
        }
        if (this.e == 1) {
            return new com.google.android.libraries.micore.superpacks.AutoValue_SlicingResult(this.c, this.d, this.a);
        }
        throw new java.lang.IllegalStateException("Missing required properties: isLastBatch");
    }

    public final void b(com.google.android.libraries.micore.superpacks.common.Slice slice) {
        defpackage.aift aiftVar = this.b;
        if (aiftVar == null) {
            aiftVar = new defpackage.aift(4);
            this.b = aiftVar;
        }
        aiftVar.i(slice);
    }

    public final void c(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
