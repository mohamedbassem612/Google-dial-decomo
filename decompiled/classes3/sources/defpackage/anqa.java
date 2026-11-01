package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class anqa extends anty {
    public final anty f;

    protected anqa(anty antyVar) {
        super((byte[]) null, (byte[]) null, (byte[]) null);
        this.f = antyVar;
    }

    public void a(anqw anqwVar, anph anphVar) {
        this.f.a(anqwVar, anphVar);
    }

    public void c(anph anphVar) {
        this.f.c(anphVar);
    }

    public void d(java.lang.Object obj) {
        this.f.d(obj);
    }

    public void e() {
        this.f.e();
    }

    public final java.lang.String toString() {
        anty antyVar = this.f;
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", antyVar);
        return ahymVarL.toString();
    }
}
