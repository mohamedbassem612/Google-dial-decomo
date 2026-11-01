package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aakw implements aakx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aaky a;

    public aakw(aaky aakyVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aakyVar);
        this.a = aakyVar;
    }

    public final int a() {
        return this.$cid != 0 ? 4 : 5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void b() throws aaos {
        int i = this.$cid;
        aaky aakyVar = this.a;
        if (i != 0) {
            try {
                aaom aaomVar = aakyVar.c.c;
                aaomVar.eR(12, aaomVar.eP());
                return;
            } catch (android.os.RemoteException e) {
                throw new aaos(e);
            }
        }
        try {
            aaom aaomVar2 = aakyVar.c.c;
            aaomVar2.eR(3, aaomVar2.eP());
        } catch (android.os.RemoteException e2) {
            throw new aaos(e2);
        }
    }

    public aakw(aaky aakyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aakyVar);
        this.a = aakyVar;
    }
}
