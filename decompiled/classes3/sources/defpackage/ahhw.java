package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhw implements defpackage.xzq {
    private final ahpz a;
    private final defpackage.ahjs b;
    private final ajct c;

    public ahhw(ahpz ahpzVar, defpackage.ahjs ahjsVar, ajct ajctVar) {
        this.a = ahpzVar;
        this.b = ahjsVar;
        this.c = ajctVar;
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        return new defpackage.ahhv(xzuVar.a(defpackage.xzg.class, java.io.InputStream.class), this.a, this.b, this.c);
    }
}
