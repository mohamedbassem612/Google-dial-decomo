package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgr implements defpackage.tgw {
    private final java.lang.CharSequence a;

    public tgr(java.lang.CharSequence charSequence) {
        aooh.f(charSequence, "text");
        this.a = charSequence;
    }

    @Override // defpackage.tgw
    public final int a() {
        return 2131231981;
    }

    @Override // defpackage.tgw
    public final java.lang.CharSequence b() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tgr) && aooh.n(this.a, ((defpackage.tgr) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AddToContact(text=" + ((java.lang.Object) this.a) + ')';
    }
}
