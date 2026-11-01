package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class kry implements aonn {
    private final defpackage.kqv a;

    public kry(defpackage.kqv kqvVar) {
        aooh.f(kqvVar, "addContactAction");
        this.a = kqvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        b((android.content.Context) obj, (defpackage.krk) obj2);
        return aojh.a;
    }

    public final void b(android.content.Context context, defpackage.krk krkVar) {
        aooh.f(context, "context");
        aooh.f(krkVar, "callActionEventListener");
        try {
            krkVar.a(new defpackage.kre(3));
            defpackage.kqv kqvVar = this.a;
            aooh.f(kqvVar, "<this>");
            android.content.Intent intentAddFlags = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI).putExtra("phone", kqvVar.c).putExtra("name", kqvVar.d).addFlags(1);
            aooh.e(intentAddFlags, "addFlags(...)");
            ahqx.l(context, intentAddFlags);
            krkVar.a(new defpackage.krg(4));
        } catch (android.content.ActivityNotFoundException unused) {
            krkVar.a(new defpackage.krh(3));
            android.widget.Toast.makeText(context, 2132018150, 1).show();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kry) && aooh.n(this.a, ((defpackage.kry) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AddContactLauncher(addContactAction=" + this.a + ')';
    }
}
