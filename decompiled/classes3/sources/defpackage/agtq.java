package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agtq implements aonj {
    public final /* synthetic */ android.net.Uri a;
    public final /* synthetic */ java.lang.String[] b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String[] d;
    public final /* synthetic */ java.lang.String e;
    public final /* synthetic */ aonj f;
    public final /* synthetic */ aogc g;

    public /* synthetic */ agtq(aogc aogcVar, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, aonj aonjVar) {
        this.g = aogcVar;
        this.a = uri;
        this.b = strArr;
        this.c = str;
        this.d = strArr2;
        this.e = str2;
        this.f = aonjVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        android.os.CancellationSignal cancellationSignal = (android.os.CancellationSignal) obj;
        aooh.f(cancellationSignal, "cancellationSignal");
        android.database.Cursor cursorN = ((apni) this.g.a).n(this.a, this.b, this.c, this.d, this.e, cancellationSignal);
        try {
            aify aifyVarBa = agab.ba(cursorN, this.f);
            ajsz.ak(cursorN, (java.lang.Throwable) null);
            return aifyVarBa;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(cursorN, th);
                throw th2;
            }
        }
    }
}
