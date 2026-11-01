package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ebv {
    public final java.util.ArrayList a = new java.util.ArrayList();
    public final defpackage.ecb b;
    public dwn c;
    public int d;
    public boolean e;
    private dwn f;

    public ebv(defpackage.ecb ecbVar, java.util.List list) {
        dwn dwnVar = dwn.a;
        this.f = dwnVar;
        this.c = dwnVar;
        f(list, false);
        f(list, true);
        if (!ecbVar.b.contains(this)) {
            ecbVar.b.add(this);
            d(ecbVar.c, ecbVar.d);
            c(ecbVar.e);
        }
        this.b = ecbVar;
    }

    private final void f(java.util.List list, boolean z) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            defpackage.ebu ebuVar = (defpackage.ebu) list.get(i);
            ebuVar.a();
            if (!z) {
                java.lang.Object obj = ebuVar.e;
                if (obj != null) {
                    throw new java.lang.IllegalStateException(ebuVar + " (" + i2 + '/' + size + ") is already controlled by " + obj + " but is still added to " + this);
                }
                ebuVar.e = this;
                this.a.add(ebuVar);
            }
            i = i2;
        }
    }

    public final int a() {
        return this.a.size();
    }

    public final defpackage.ebu b(int i) {
        return (defpackage.ebu) this.a.get(i);
    }

    public final void c(int i) {
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.ebu) arrayList.get(size)).b();
            }
        }
    }

    public final void d(dwn dwnVar, dwn dwnVar2) {
        this.f = dwnVar;
        this.c = dwnVar2;
        e();
    }

    public final void e() {
        java.util.ArrayList arrayList = this.a;
        dwn dwnVar = dwn.a;
        dwn dwnVarB = dwnVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            defpackage.ebu ebuVar = (defpackage.ebu) arrayList.get(size);
            dwn dwnVar2 = this.f;
            dwn dwnVar3 = this.c;
            ebuVar.c = dwnVar2;
            ebuVar.d = dwnVar3;
            defpackage.ebt ebtVar = ebuVar.b;
            if (!ebtVar.b.equals(dwnVarB)) {
                ebtVar.b = dwnVarB;
                defpackage.ebw ebwVar = ebtVar.g;
                if (ebwVar != null) {
                    int i = dwnVarB.b;
                    java.lang.Object obj = ebwVar.a;
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) obj;
                    layoutParams.leftMargin = i;
                    layoutParams.topMargin = dwnVarB.c;
                    layoutParams.rightMargin = dwnVarB.d;
                    layoutParams.bottomMargin = dwnVarB.e;
                    ((android.view.View) ebwVar.b).setLayoutParams((android.view.ViewGroup.LayoutParams) obj);
                }
            }
            int i2 = ebuVar.c.c;
            int iC = ebuVar.c(ebuVar.d.c);
            if (ebtVar.a != iC) {
                ebtVar.a = iC;
                defpackage.ebw ebwVar2 = ebtVar.g;
                if (ebwVar2 != null) {
                    java.lang.Object obj2 = ebwVar2.a;
                    ((android.widget.FrameLayout.LayoutParams) obj2).height = iC;
                    ((android.view.View) ebwVar2.b).setLayoutParams((android.view.ViewGroup.LayoutParams) obj2);
                }
            }
            ebuVar.f(i2 > 0);
            float f = i2 > 0 ? 1.0f : 0.0f;
            ebuVar.d(f);
            ebuVar.e(f);
            dwnVarB = dwn.b(dwnVarB, dwnVar);
        }
    }
}
