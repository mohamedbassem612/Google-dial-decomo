package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwg implements defpackage.lws {
    public final java.lang.String a;
    public final tfn b;
    private final java.lang.String c;

    public lwg(java.lang.String str, tfn tfnVar) {
        aooh.f(str, "id");
        aooh.f(tfnVar, "searchResultData");
        this.a = str;
        this.b = tfnVar;
        this.c = snl.au(this, str);
    }

    public final java.lang.String a() {
        return this.c;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lwg) {
            defpackage.lwg lwgVar = (defpackage.lwg) obj;
            if (aooh.n(this.a, lwgVar.a) && aooh.n(this.b, lwgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ExtendedDirectoryContact(id=" + this.a + ", searchResultData=" + this.b + ')';
    }
}
