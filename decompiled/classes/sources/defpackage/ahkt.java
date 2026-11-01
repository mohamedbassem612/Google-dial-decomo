package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkt {
    public java.lang.String a;
    public java.lang.Boolean b;
    public defpackage.aift c;
    public defpackage.ahkq d;
    public defpackage.ahkk e;
    private final defpackage.ahyn f;
    private final defpackage.ahyn g;
    private defpackage.aify h;
    private defpackage.aify i;

    public ahkt() {
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        this.f = ahwtVar;
        this.g = ahwtVar;
    }

    public final defpackage.ahku a() {
        java.lang.Boolean bool;
        defpackage.ahkq ahkqVar;
        defpackage.ahkk ahkkVar;
        defpackage.aift aiftVar = this.c;
        if (aiftVar != null) {
            this.h = aiftVar.g();
        } else if (this.h == null) {
            this.h = defpackage.aike.a;
        }
        if (this.i == null) {
            this.i = defpackage.aike.a;
        }
        java.lang.String str = this.a;
        if (str != null && (bool = this.b) != null && (ahkqVar = this.d) != null && (ahkkVar = this.e) != null) {
            return new defpackage.ahku(str, this.f, bool, this.g, this.h, ahkqVar, ahkkVar, this.i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" enableMultiInstanceInvalidation");
        }
        if (this.d == null) {
            sb.append(" fallbackMigrationStrategy");
        }
        if (this.e == null) {
            sb.append(" storage");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
