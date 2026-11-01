package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ksa implements aonn {
    private final defpackage.kqv a;

    public ksa(defpackage.kqv kqvVar) {
        aooh.f(kqvVar, "addContactAction");
        this.a = kqvVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        defpackage.krk krkVar = (defpackage.krk) obj2;
        aooh.f(context, "context");
        aooh.f(krkVar, "callActionEventListener");
        krkVar.a(new defpackage.kre(4));
        defpackage.kqv kqvVar = this.a;
        aooh.f(kqvVar, "<this>");
        com.android.dialer.callintent.CallIntent$Builder callIntent$BuilderA = defpackage.jwz.a();
        callIntent$BuilderA.z(34);
        callIntent$BuilderA.y(kqvVar.c);
        ahqx.l(context, callIntent$BuilderA.w());
        krkVar.a(new defpackage.krg(5));
        return aojh.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ksa) && aooh.n(this.a, ((defpackage.ksa) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "CallPersonLauncher(addContactAction=" + this.a + ')';
    }
}
