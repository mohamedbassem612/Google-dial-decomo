package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aops extends defpackage.aopr implements aopn {
    public static final defpackage.aops c = new defpackage.aops(1, 0);

    @Override // defpackage.aopr
    public final boolean d() {
        return this.a > this.b;
    }

    @Override // defpackage.aopr
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aops)) {
            return false;
        }
        if (!d() || !((defpackage.aops) obj).d()) {
            defpackage.aops aopsVar = (defpackage.aops) obj;
            if (this.a != aopsVar.a || this.b != aopsVar.b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aopr
    public final int hashCode() {
        if (d()) {
            return -1;
        }
        return (anty.M(this.a) * 31) + anty.M(this.b);
    }

    @Override // defpackage.aopr
    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
