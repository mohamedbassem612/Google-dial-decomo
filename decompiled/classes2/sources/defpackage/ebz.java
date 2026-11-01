package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ebz extends eac {
    final /* synthetic */ defpackage.ecb a;
    private final java.util.HashMap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebz(defpackage.ecb ecbVar) {
        super(0);
        this.a = ecbVar;
        this.b = new java.util.HashMap();
    }

    private static final boolean a(aiyy aiyyVar) {
        return (aiyyVar.g() & 519) != 0;
    }

    public final eax b(eax eaxVar, java.util.List list) {
        android.graphics.RectF rectF = new android.graphics.RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            aiyy aiyyVar = (aiyy) list.get(size);
            java.lang.Integer num = (java.lang.Integer) this.b.get(aiyyVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fM$2 = baa$.ExternalSyntheticApiModelOutline1.m$2(((eae) aiyyVar.a).a);
                if ((iIntValue & 1) != 0) {
                    rectF.left = fM$2;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fM$2;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fM$2;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fM$2;
                }
                i |= iIntValue;
            }
        }
        defpackage.ecb ecbVar = this.a;
        dwn dwnVarA = defpackage.ecb.a(eaxVar);
        java.util.ArrayList arrayList = ecbVar.b;
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return eaxVar;
            }
            defpackage.ebv ebvVar = (defpackage.ebv) arrayList.get(size2);
            dwn dwnVar = ebvVar.c;
            java.util.ArrayList arrayList2 = ebvVar.a;
            int size3 = arrayList2.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    defpackage.ebu ebuVar = (defpackage.ebu) arrayList2.get(size3);
                    int i2 = ebuVar.a;
                    if ((i & 2) != 0) {
                        ebuVar.f(true);
                        int i3 = dwnVar.c;
                        if (i3 > 0) {
                            ebuVar.e(dwnVarA.c / i3);
                        }
                        ebuVar.d(rectF.top);
                    }
                }
            }
        }
    }

    public final eab c(aiyy aiyyVar, eab eabVar) {
        if (a(aiyyVar)) {
            dwn dwnVar = eabVar.b;
            dwn dwnVar2 = eabVar.a;
            int i = dwnVar.b != dwnVar2.b ? 1 : 0;
            if (dwnVar.c != dwnVar2.c) {
                i |= 2;
            }
            if (dwnVar.d != dwnVar2.d) {
                i |= 4;
            }
            if (dwnVar.e != dwnVar2.e) {
                i |= 8;
            }
            this.b.put(aiyyVar, java.lang.Integer.valueOf(i));
        }
        return eabVar;
    }

    public final void d(aiyy aiyyVar) {
        if (!a(aiyyVar)) {
            return;
        }
        this.b.remove(aiyyVar);
        java.util.ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.ebv ebvVar = (defpackage.ebv) arrayList.get(size);
            int i = ebvVar.d;
            int i2 = i - 1;
            ebvVar.d = i2;
            if (i > 0 && i2 == 0) {
                ebvVar.e();
            }
        }
    }

    public final void e(aiyy aiyyVar) {
        if (!a(aiyyVar)) {
            return;
        }
        java.util.ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((defpackage.ebv) arrayList.get(size)).d++;
        }
    }
}
