package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class apsm implements defpackage.apru {
    private final defpackage.apru a;
    private final java.util.Map b = new java.util.HashMap();

    public apsm(defpackage.apru apruVar) {
        this.a = apruVar;
    }

    @Override // defpackage.apru
    public final defpackage.aprx a(defpackage.aptm aptmVar, defpackage.aprr aprrVar) {
        defpackage.apru apruVar = (defpackage.apru) this.b.get(((defpackage.aptu) aptmVar).b.toLowerCase());
        if (apruVar == null) {
            apruVar = this.a;
        }
        return apruVar.a(aptmVar, aprrVar);
    }

    public final void c(java.lang.String str, defpackage.apru apruVar) {
        this.b.put(str.toLowerCase(), apruVar);
    }
}
