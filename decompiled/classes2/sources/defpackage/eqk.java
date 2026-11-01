package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqk {
    public java.lang.String a;
    public android.net.Uri b;
    public defpackage.eqo c;
    private java.lang.String d;
    private java.util.List e;
    private aify f;
    private long g;
    private defpackage.eqw h;
    private final defpackage.eqr i;
    private defpackage.hhy j;
    private final defpackage.esv k;

    public eqk(defpackage.eqt eqtVar) {
        this();
        this.k = new defpackage.esv();
        this.a = eqtVar.a;
        this.h = eqtVar.d;
        this.c = new defpackage.eqo(eqtVar.c);
        this.i = eqtVar.f;
        defpackage.eqq eqqVar = eqtVar.b;
        if (eqqVar != null) {
            this.d = eqqVar.b;
            this.b = eqqVar.a;
            this.e = eqqVar.e;
            this.f = eqqVar.g;
            defpackage.eqn eqnVar = eqqVar.c;
            this.j = eqnVar != null ? new defpackage.hhy(eqnVar) : new defpackage.hhy();
            this.g = eqqVar.i;
        }
    }

    public final defpackage.eqt a() {
        java.lang.Object obj = this.j.b;
        android.net.Uri uri = this.b;
        defpackage.eqq eqqVar = null;
        if (uri != null) {
            defpackage.eqn eqnVar = null;
            java.lang.String str = this.d;
            defpackage.hhy hhyVar = this.j;
            if (hhyVar.c != null) {
                eqnVar = new defpackage.eqn(hhyVar);
            }
            eqqVar = new defpackage.eqq(uri, str, eqnVar, this.e, this.f, this.g);
        }
        defpackage.eqq eqqVar2 = eqqVar;
        java.lang.String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        defpackage.eqm eqmVar = new defpackage.eqm(this.k);
        defpackage.eqp eqpVar = new defpackage.eqp(this.c);
        defpackage.eqw eqwVar = this.h;
        if (eqwVar == null) {
            eqwVar = defpackage.eqw.a;
        }
        return new defpackage.eqt(str2, eqmVar, eqqVar2, eqpVar, eqwVar, this.i);
    }

    public eqk() {
        this.k = new defpackage.esv();
        this.j = new defpackage.hhy();
        this.e = java.util.Collections.EMPTY_LIST;
        this.f = aike.a;
        this.c = new defpackage.eqo();
        this.i = defpackage.eqr.a;
        this.g = -9223372036854775807L;
    }
}
