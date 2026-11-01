package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wgc implements java.lang.Iterable {
    public final java.util.List a;
    public final defpackage.wgb b;
    public final defpackage.wgb c;
    public final defpackage.wgb d;
    public final defpackage.wgb e;
    public final defpackage.wgb f;
    public final defpackage.wgb g;
    public final defpackage.wfz h;
    public float i;
    public float j;
    public final aae k;

    public wgc(defpackage.wgb wgbVar, defpackage.wgb wgbVar2, defpackage.wgb wgbVar3, defpackage.wgb wgbVar4, defpackage.wgb wgbVar5, defpackage.wgb wgbVar6, aae aaeVar, defpackage.wfz wfzVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(6);
        this.a = arrayList;
        this.i = 75.0f;
        this.j = 25.0f;
        this.b = wgbVar;
        wgbVar.m(12.0f, 3.1415927f, 1.0f, -12483341);
        this.c = wgbVar2;
        wgbVar2.m(4.0f, 3.1415927f, 1.0f, -1424587);
        this.d = wgbVar3;
        wgbVar3.m(4.0f, 0.0f, 1.0f, -279547);
        this.e = wgbVar4;
        wgbVar4.m(12.0f, 0.0f, 1.0f, -13326253);
        this.f = wgbVar5;
        wgbVar5.m(8.0f, 0.0f, 0.0f, -12483341);
        this.g = wgbVar6;
        wgbVar6.m(16.0f, 0.0f, 0.0f, -1424587);
        this.k = aaeVar;
        this.h = wfzVar;
        wfzVar.e(1.0f);
        if (arrayList.isEmpty()) {
            arrayList.add(wgbVar4);
            arrayList.add(wgbVar3);
            arrayList.add(wgbVar2);
            arrayList.add(wgbVar);
        }
    }

    public final float a() {
        return this.k.d();
    }

    public final int b(defpackage.wgb wgbVar) {
        if (wgbVar == this.b) {
            return 0;
        }
        if (wgbVar == this.c) {
            return 1;
        }
        if (wgbVar == this.d) {
            return 2;
        }
        if (wgbVar == this.e) {
            return 3;
        }
        throw new java.lang.IllegalArgumentException("Unknown or unexpected dot");
    }

    public final void c(float f) {
        this.h.c(f);
    }

    public final void d(defpackage.wgb wgbVar, float f) {
        defpackage.wfy wfyVar = wgbVar.b;
        float f2 = f - wfyVar.b;
        wfyVar.b(f2);
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar2 = (defpackage.wgb) it.next();
            if (wgbVar2 != wgbVar) {
                wgbVar2.o(f2);
            }
        }
        this.k.e(-f2);
    }

    public final void e() {
        aae aaeVar = this.k;
        defpackage.wfz wfzVar = (defpackage.wfz) aaeVar.c;
        float f = wfzVar.c;
        defpackage.wfz wfzVar2 = (defpackage.wfz) aaeVar.b;
        if (f != wfzVar2.d) {
            wfzVar2.d = f;
            wfzVar2.e = false;
        }
        wfzVar2.c(0.0f);
        wfzVar.e(0.0f);
        aaeVar.a = false;
    }

    public final void f() {
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            defpackage.wgb wgbVar = (defpackage.wgb) it.next();
            defpackage.wga wgaVar = wgbVar.a;
            wgaVar.e(wgaVar.b);
            defpackage.wfy wfyVar = wgbVar.b;
            wfyVar.e(wfyVar.b);
            defpackage.wga wgaVar2 = wgbVar.c;
            wgaVar2.e(wgaVar2.b);
            defpackage.wga wgaVar3 = wgbVar.d;
            wgaVar3.e(wgaVar3.b);
            defpackage.wga wgaVar4 = wgbVar.e;
            wgaVar4.e(wgaVar4.b);
            defpackage.wfz wfzVar = wgbVar.f;
            wfzVar.e(wfzVar.b);
            defpackage.wfz wfzVar2 = wgbVar.h;
            wfzVar2.e(wfzVar2.b);
            defpackage.wfz wfzVar3 = wgbVar.g;
            wfzVar3.e(wfzVar3.b);
        }
        aae aaeVar = this.k;
        defpackage.wfz wfzVar4 = (defpackage.wfz) aaeVar.c;
        wfzVar4.e(wfzVar4.b);
        defpackage.wfz wfzVar5 = (defpackage.wfz) aaeVar.b;
        wfzVar5.e(wfzVar5.b);
        defpackage.wfz wfzVar6 = this.h;
        wfzVar6.e(wfzVar6.b);
    }

    public final void g(float f) {
        aae aaeVar = this.k;
        ((defpackage.wfz) aaeVar.c).c(f);
        aaeVar.a = true;
    }

    public final void h() {
        aae aaeVar = this.k;
        float fD = (-0.3926991f) - aaeVar.d();
        aaeVar.e(fD);
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            ((defpackage.wgb) it.next()).o(-fD);
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.iterator();
    }
}
