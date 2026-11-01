package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adub implements defpackage.adtz {
    public final java.lang.Object a;

    public adub(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.adtz
    public final /* synthetic */ defpackage.adty c() {
        return defpackage.agab.bY(this);
    }

    @Override // defpackage.adtz
    public final /* synthetic */ java.lang.Object d() {
        return defpackage.agab.bZ(this);
    }

    @Override // defpackage.adtz
    public final /* synthetic */ java.lang.String e() {
        return defpackage.agab.ca(this);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.adub) && defpackage.aooh.n(this.a, ((defpackage.adub) obj).a);
        }
        return true;
    }

    @Override // defpackage.adtz
    public final /* synthetic */ java.lang.Throwable f() {
        return defpackage.agab.cb(this);
    }

    @Override // defpackage.adtz
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.adtz
    public final /* synthetic */ boolean h() {
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // defpackage.adtz
    public final /* synthetic */ boolean i() {
        return true;
    }

    @Override // defpackage.adtz
    public final /* synthetic */ boolean j() {
        return false;
    }

    public final java.lang.String toString() {
        return "Success(value=" + this.a + ')';
    }
}
