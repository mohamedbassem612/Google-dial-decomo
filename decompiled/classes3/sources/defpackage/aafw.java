package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aafw implements defpackage.aavz {
    public final com.google.android.gms.common.data.DataHolder a;
    protected int b;
    public int c;

    public aafw(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        aais.as(dataHolder);
        this.a = dataHolder;
        boolean z = false;
        if (i >= 0 && i < dataHolder.h) {
            z = true;
        }
        aais.an(z);
        this.b = i;
        this.c = dataHolder.b(i);
    }

    public final int a(java.lang.String str) {
        return this.a.a(str, this.b, this.c);
    }

    public final java.lang.String b(java.lang.String str) {
        return this.a.c(str, this.b, this.c);
    }

    public final java.lang.String c() {
        return defpackage.aasl.a.a(b("avatar"));
    }

    public final java.lang.String d() {
        return !android.text.TextUtils.isEmpty(b("display_name")) ? b("display_name") : b("account_name");
    }

    public final java.lang.String e() {
        return g() ? b("family_name") : "null";
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aafw)) {
            return false;
        }
        defpackage.aafw aafwVar = (defpackage.aafw) obj;
        return j$.util.Objects.equals(java.lang.Integer.valueOf(aafwVar.b), java.lang.Integer.valueOf(this.b)) && j$.util.Objects.equals(java.lang.Integer.valueOf(aafwVar.c), java.lang.Integer.valueOf(this.c)) && aafwVar.a == this.a;
    }

    public final java.lang.String f() {
        return h() ? b("given_name") : "null";
    }

    public final boolean g() {
        return !android.text.TextUtils.isEmpty(b("family_name"));
    }

    public final boolean h() {
        return !android.text.TextUtils.isEmpty(b("given_name"));
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), this.a});
    }

    @Override // defpackage.aavz
    public final java.lang.String i() {
        return b("asset_key");
    }

    @Override // defpackage.aavz
    public final java.lang.String j() {
        return b("asset_id");
    }
}
