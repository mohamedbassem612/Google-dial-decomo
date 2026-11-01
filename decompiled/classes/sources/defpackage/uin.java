package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uin implements defpackage.uip {
    public final defpackage.udj a;
    public final defpackage.uio b;
    private final java.lang.Long c;
    private final int d;

    public /* synthetic */ uin(defpackage.udj udjVar, int i, java.lang.Long l, defpackage.uio uioVar, int i2) {
        defpackage.uio uioVar2 = (i2 & 8) != 0 ? new defpackage.uio(null, null, null, null, null, null, null, null, null, null, null) : uioVar;
        if (udjVar == null) {
            defpackage.aooh.i("spamStatus");
        }
        i = (i2 & 2) != 0 ? 3 : i;
        if (i == 0) {
            defpackage.aooh.i("overallSuspiciousStatus");
            i = 0;
        }
        if (uioVar2 == null) {
            defpackage.aooh.i("spamMetadata");
        }
        l = (i2 & 4) != 0 ? null : l;
        this.a = udjVar;
        this.d = i;
        this.c = l;
        this.b = uioVar2;
    }

    public static final defpackage.uik a() {
        defpackage.uik uikVar = new defpackage.uik();
        uikVar.b = 3;
        uikVar.a = (byte) (uikVar.a | 2);
        return uikVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.uin) {
            defpackage.uin uinVar = (defpackage.uin) obj;
            if (this.a == uinVar.a && this.d == uinVar.d && defpackage.aooh.n(this.c, uinVar.c) && defpackage.aooh.n(this.b, uinVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + defpackage.a.aq(this.d);
        java.lang.Long l = this.c;
        return (((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.b.hashCode();
    }

    @Override // defpackage.uip
    public final defpackage.udj j() {
        return this.a;
    }

    @Override // defpackage.uip
    public final defpackage.uio k() {
        return this.b;
    }

    @Override // defpackage.uip
    public final j$.util.Optional m() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.c);
        defpackage.aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SimpleSpamStatus(spamStatus=");
        sb.append(this.a);
        sb.append(", overallSuspiciousStatus=");
        int i = this.d;
        sb.append((java.lang.Object) (i != 0 ? java.lang.Integer.toString(i - 1) : "null"));
        sb.append(", timestampMillis=");
        sb.append(this.c);
        sb.append(", spamMetadata=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
