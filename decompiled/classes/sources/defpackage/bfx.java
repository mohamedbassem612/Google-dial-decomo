package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class bfx implements defpackage.crd, defpackage.cqq {
    public final defpackage.bfy a;
    public final defpackage.bfy b;
    public final defpackage.bfy c;
    public final defpackage.bfy d;

    public bfx(defpackage.bfy bfyVar, defpackage.bfy bfyVar2, defpackage.bfy bfyVar3, defpackage.bfy bfyVar4) {
        this.a = bfyVar;
        this.b = bfyVar2;
        this.c = bfyVar3;
        this.d = bfyVar4;
    }

    public static /* synthetic */ defpackage.bfx d(defpackage.bfx bfxVar, defpackage.bfy bfyVar, defpackage.bfy bfyVar2, defpackage.bfy bfyVar3, defpackage.bfy bfyVar4, int i) {
        if ((i & 1) != 0) {
            bfyVar = bfxVar.a;
        }
        if ((i & 2) != 0) {
            bfyVar2 = bfxVar.b;
        }
        if ((i & 4) != 0) {
            bfyVar3 = bfxVar.c;
        }
        if ((i & 8) != 0) {
            bfyVar4 = bfxVar.d;
        }
        return new defpackage.bgc(bfyVar, bfyVar2, bfyVar3, bfyVar4);
    }

    @Override // defpackage.crd
    public final defpackage.cqx a(long j, defpackage.dpq dpqVar, defpackage.dpf dpfVar) {
        defpackage.bfy bfyVar = this.d;
        defpackage.bfy bfyVar2 = this.c;
        defpackage.bfy bfyVar3 = this.b;
        float fA = this.a.a(j, dpfVar);
        float fA2 = bfyVar3.a(j, dpfVar);
        float fA3 = bfyVar2.a(j, dpfVar);
        float fA4 = bfyVar.a(j, dpfVar);
        float f = fA + fA4;
        float fA5 = defpackage.cpp.a(j);
        if (f > fA5) {
            float f2 = fA5 / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fA5) {
            float f4 = fA5 / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        float f5 = fA2;
        if (fA < 0.0f || f5 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            avo.c("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + f5 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return b(j, fA, f5, fA3, fA4, dpqVar);
    }

    public abstract defpackage.cqx b(long j, float f, float f2, float f3, float f4, defpackage.dpq dpqVar);

    @Override // defpackage.cqq
    public java.lang.Object c(java.lang.Object obj, float f) {
        throw null;
    }
}
