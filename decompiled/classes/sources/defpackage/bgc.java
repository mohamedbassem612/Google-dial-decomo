package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bgc extends defpackage.bfx {
    @Override // defpackage.bfx
    public final defpackage.cqx b(long j, float f, float f2, float f3, float f4, defpackage.dpq dpqVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new defpackage.cqv(defpackage.cdh.x(0L, j));
        }
        defpackage.cpn cpnVarX = defpackage.cdh.x(0L, j);
        defpackage.dpq dpqVar2 = defpackage.dpq.a;
        float f5 = dpqVar == dpqVar2 ? f : f2;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f5);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f5);
        float f6 = dpqVar != dpqVar2 ? f : f2;
        long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f6);
        long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(f6);
        float f7 = dpqVar == dpqVar2 ? f3 : f4;
        long jFloatToRawIntBits5 = java.lang.Float.floatToRawIntBits(f7);
        long jFloatToRawIntBits6 = java.lang.Float.floatToRawIntBits(f7);
        float f8 = dpqVar != dpqVar2 ? f3 : f4;
        return new defpackage.cqw(defpackage.cdh.s(cpnVarX, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(f8)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    @Override // defpackage.bfx, defpackage.cqq
    public final java.lang.Object c(java.lang.Object obj, float f) {
        if (defpackage.aooh.n(obj, defpackage.cqz.a) || obj == null) {
            defpackage.bgc bgcVar = defpackage.bge.a;
            bgb bgbVar = new bgb();
            obj = new defpackage.bgc(bgbVar, bgbVar, bgbVar, bgbVar);
        }
        if (!(obj instanceof defpackage.bgc)) {
            return null;
        }
        defpackage.bgc bgcVar2 = (defpackage.bgc) obj;
        defpackage.bfy bfyVar = this.a;
        defpackage.bfy bfyVar2 = bgcVar2.a;
        defpackage.bgc bgcVar3 = defpackage.bge.a;
        return new defpackage.bgc(new bgd(bfyVar, bfyVar2, f), new bgd(this.b, bgcVar2.b, f), new bgd(this.c, bgcVar2.c, f), new bgd(this.d, bgcVar2.d, f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bgc) {
            defpackage.bgc bgcVar = (defpackage.bgc) obj;
            if (defpackage.aooh.n(this.a, bgcVar.a) && defpackage.aooh.n(this.b, bgcVar.b) && defpackage.aooh.n(this.c, bgcVar.c) && defpackage.aooh.n(this.d, bgcVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
