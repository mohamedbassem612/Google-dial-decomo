package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ahvw extends defpackage.ahwd {
    private static final long serialVersionUID = -1522852442442473691L;
    protected final java.lang.String a;
    private final java.lang.String h;
    private final boolean i;

    static {
        int i = defpackage.ahvv.a;
    }

    protected ahvw() {
        super(null, defpackage.ahwd.c, defpackage.ahwd.b);
        this.a = null;
        this.h = "googleapis.com";
        this.i = false;
    }

    protected ahym b() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.c();
        ahymVarL.b("quotaProjectId", (java.lang.Object) null);
        ahymVarL.b("universeDomain", this.h);
        ahymVarL.g("isExplicitUniverseDomain", false);
        return ahymVarL;
    }

    @Override // defpackage.ahwd
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ahvw)) {
            return false;
        }
        defpackage.ahvw ahvwVar = (defpackage.ahvw) obj;
        java.lang.String str = ahvwVar.a;
        if (!j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) || !j$.util.Objects.equals(this.h, ahvwVar.h)) {
            return false;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean z = ahvwVar.i;
        return j$.util.Objects.equals(bool, bool);
    }

    @Override // defpackage.ahwd
    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{null, this.h, java.lang.Boolean.FALSE});
    }

    @Override // defpackage.ahwd
    public final java.lang.String toString() {
        return b().toString();
    }
}
