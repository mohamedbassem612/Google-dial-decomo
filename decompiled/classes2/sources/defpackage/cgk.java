package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cgk extends chd {
    public static final defpackage.cgk a = new defpackage.cgk();

    private cgk() {
        super(1, 0);
    }

    protected final void a(chg chgVar, cah cahVar, cfp cfpVar, cjh cjhVar, che cheVar) {
        cfh cfhVar;
        int iA;
        int iA2 = chgVar.a(0);
        if (cfpVar.m != 0) {
            cax.b("Cannot move a group while inserting");
        }
        if (iA2 < 0) {
            cax.b("Parameter offset is out of bounds");
        }
        if (iA2 != 0) {
            int i = cfpVar.o;
            int i2 = cfpVar.q;
            int i3 = cfpVar.p;
            int i4 = i;
            while (iA2 > 0) {
                i4 += cfpVar.b[(cfpVar.h(i4) * 5) + 3];
                if (i4 > i3) {
                    cax.b("Parameter offset is out of bounds");
                }
                iA2--;
            }
            int[] iArr = cfpVar.b;
            int i5 = iArr[(cfpVar.h(i4) * 5) + 3];
            int iD = cfpVar.d(iArr, cfpVar.h(cfpVar.o));
            int iD2 = cfpVar.d(cfpVar.b, cfpVar.h(i4));
            int i6 = i4 + i5;
            int iD3 = cfpVar.d(cfpVar.b, cfpVar.h(i6));
            int i7 = iD3 - iD2;
            cfpVar.C(i7, java.lang.Math.max(cfpVar.o - 1, 0));
            cfpVar.B(i5);
            int[] iArr2 = cfpVar.b;
            int iH = cfpVar.h(i6) * 5;
            ajsz.db(iArr2, iArr2, cfpVar.h(i) * 5, iH, (i5 * 5) + iH);
            if (i7 > 0) {
                java.lang.Object[] objArr = cfpVar.c;
                int iE = cfpVar.e(iD2 + i7);
                java.lang.System.arraycopy(objArr, iE, objArr, iD, cfpVar.e(iD3 + i7) - iE);
            }
            int i8 = iD2 + i7;
            int i9 = i8 - iD;
            int i10 = cfpVar.j;
            int i11 = cfpVar.k;
            int length = cfpVar.c.length;
            int i12 = cfpVar.l;
            int i13 = i + i5;
            int i14 = i;
            while (i14 < i13) {
                int iH2 = cfpVar.h(i14);
                int i15 = i9;
                int iD4 = cfpVar.d(iArr2, iH2) - i15;
                if (iD4 > (i12 < iH2 ? 0 : i10)) {
                    iD4 = -(((length - i11) - iD4) + 1);
                }
                int i16 = cfpVar.j;
                int i17 = i10;
                int i18 = cfpVar.k;
                int length2 = cfpVar.c.length;
                if (iD4 > i16) {
                    iD4 = -(((length2 - i18) - iD4) + 1);
                }
                iArr2[(iH2 * 5) + 4] = iD4;
                i14++;
                i9 = i15;
                i10 = i17;
            }
            int i19 = i6 + i5;
            int iG = cfpVar.g();
            int iA3 = cfo.a(cfpVar.d, i6, iG);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (iA3 < cfpVar.d.size() && (iA = cfpVar.a((cfhVar = (cfh) cfpVar.d.get(iA3)))) >= i6 && iA < i19) {
                arrayList.add(cfhVar);
            }
            int i20 = i - i6;
            int size = arrayList.size();
            for (int i21 = 0; i21 < size; i21++) {
                cfh cfhVar2 = (cfh) arrayList.get(i21);
                int iA4 = cfpVar.a(cfhVar2) + i20;
                if (iA4 >= cfpVar.f) {
                    cfhVar2.a = -(iG - iA4);
                } else {
                    cfhVar2.a = iA4;
                }
                cfpVar.d.add(cfo.a(cfpVar.d, iA4, iG), cfhVar2);
            }
            if (cfpVar.U(i6, i5)) {
                cax.b("Unexpectedly removed anchors");
            }
            cfpVar.A(i2, cfpVar.p, i);
            if (i7 > 0) {
                cfpVar.H(i8, i7, i6 - 1);
            }
        }
    }
}
