package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsm implements defpackage.acrc {
    public final int a;
    public final defpackage.acss b;
    public final aoiu c;
    public final aomy d;
    public final aomy e;
    public final ajl f;
    public final ajl g;
    public final ajl h;
    public final boolean i;
    public final float j;
    public final int k;
    private final java.lang.Object l;

    public acsm(int i, defpackage.acss acssVar, aoiu aoiuVar, aomy aomyVar, aomy aomyVar2, ajl ajlVar, ajl ajlVar2, ajl ajlVar3, boolean z, float f, int i2) {
        aooh.f(ajlVar, "enterAnimationSpec");
        aooh.f(ajlVar2, "exitAnimationSpec");
        aooh.f(ajlVar3, "stateTransitionSpec");
        this.l = "EnergyEffect102";
        this.a = i;
        this.b = acssVar;
        this.c = aoiuVar;
        this.d = aomyVar;
        this.e = aomyVar2;
        this.f = ajlVar;
        this.g = ajlVar2;
        this.h = ajlVar3;
        this.i = z;
        this.j = f;
        this.k = i2;
    }

    @Override // defpackage.acrc
    public final defpackage.acrh a(aoss aossVar) {
        return new defpackage.acsl(aossVar);
    }

    @Override // defpackage.acrc
    public final java.lang.Object b() {
        return this.l;
    }
}
