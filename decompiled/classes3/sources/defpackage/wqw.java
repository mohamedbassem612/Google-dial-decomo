package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wqw {
    private static final aimz b = aimz.i("com/android/dialer/xatu/impl/storage/XatuPersistedTreeConverter");
    public final aoin a;

    public wqw(aoin aoinVar) {
        this.a = aoinVar;
    }

    public static defpackage.wqv a(amgq amgqVar, int i) {
        akzx akzxVarM = defpackage.wqv.a.m();
        amfv amfvVar = amgqVar.e;
        if (amfvVar == null) {
            amfvVar = amfv.a;
        }
        amfu amfuVar = amfvVar.c;
        if (amfuVar == null) {
            amfuVar = amfu.a;
        }
        for (int i2 = 0; i2 < amfuVar.b.size(); i2++) {
            amft amftVar = (amft) amfuVar.b.get(i2);
            if (i2 < amfuVar.b.size() - i || amftVar.c != 1) {
                akzx akzxVarM2 = defpackage.wqx.a.m();
                long j = amftVar.e;
                akzxVarM2.u();
                defpackage.wqx wqxVar = (defpackage.wqx) akzxVarM2.b;
                wqxVar.b |= 1;
                wqxVar.e = j;
                long j2 = amftVar.f;
                akzxVarM2.u();
                defpackage.wqx wqxVar2 = (defpackage.wqx) akzxVarM2.b;
                int i3 = 2;
                wqxVar2.b |= 2;
                wqxVar2.f = j2;
                int i4 = amftVar.c;
                int iE = amjk.e(i4);
                if (iE == 0) {
                    throw null;
                }
                int i5 = iE - 1;
                if (i5 == 0) {
                    amfp amfpVar = i4 == 1 ? (amfp) amftVar.d : amfp.a;
                    akzx akzxVarM3 = defpackage.wqz.a.m();
                    amfy amfyVar = amfpVar.d;
                    if (amfyVar == null) {
                        amfyVar = amfy.a;
                    }
                    java.lang.String str = amfyVar.c;
                    akzxVarM3.u();
                    defpackage.wqz wqzVar = (defpackage.wqz) akzxVarM3.b;
                    j$.util.Objects.requireNonNull(str);
                    wqzVar.b |= 1;
                    wqzVar.c = str;
                    defpackage.wqz wqzVar2 = (defpackage.wqz) akzxVarM3.p();
                    akzxVarM2.u();
                    defpackage.wqx wqxVar3 = (defpackage.wqx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(wqzVar2);
                    wqxVar3.d = wqzVar2;
                    wqxVar3.c = 2;
                } else if (i5 == 1) {
                    amgc amgcVar = i4 == 2 ? (amgc) amftVar.d : amgc.a;
                    akzx akzxVarM4 = defpackage.wqy.a.m();
                    amfy amfyVar2 = amgcVar.e;
                    if (amfyVar2 == null) {
                        amfyVar2 = amfy.a;
                    }
                    java.lang.String str2 = amfyVar2.c;
                    akzxVarM4.u();
                    defpackage.wqy wqyVar = (defpackage.wqy) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(str2);
                    wqyVar.b |= 1;
                    wqyVar.c = str2;
                    java.lang.String str3 = amgcVar.c;
                    akzxVarM4.u();
                    defpackage.wqy wqyVar2 = (defpackage.wqy) akzxVarM4.b;
                    j$.util.Objects.requireNonNull(str3);
                    wqyVar2.b |= 8;
                    wqyVar2.f = str3;
                    int iAN = a.aN(amgcVar.g);
                    if (iAN == 0) {
                        iAN = 1;
                    }
                    int i6 = iAN - 1;
                    if (i6 == 1) {
                        i3 = 4;
                    } else if (i6 != 2) {
                        if (i6 != 3) {
                            throw new java.lang.IllegalStateException("option state is unrecognized");
                        }
                        i3 = 3;
                    }
                    akzxVarM4.u();
                    defpackage.wqy wqyVar3 = (defpackage.wqy) akzxVarM4.b;
                    wqyVar3.e = i3 - 1;
                    wqyVar3.b |= 4;
                    defpackage.wqy wqyVar4 = (defpackage.wqy) akzxVarM4.p();
                    akzxVarM2.u();
                    defpackage.wqx wqxVar4 = (defpackage.wqx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(wqyVar4);
                    wqxVar4.d = wqyVar4;
                    wqxVar4.c = 3;
                } else if (i5 == 5) {
                    amgf amgfVar = i4 == 8 ? (amgf) amftVar.d : amgf.a;
                    akzx akzxVarM5 = defpackage.wra.a.m();
                    amfy amfyVar3 = amgfVar.e;
                    if (amfyVar3 == null) {
                        amfyVar3 = amfy.a;
                    }
                    java.lang.String str4 = amfyVar3.c;
                    akzxVarM5.u();
                    defpackage.wra wraVar = (defpackage.wra) akzxVarM5.b;
                    j$.util.Objects.requireNonNull(str4);
                    wraVar.b |= 1;
                    wraVar.c = str4;
                    defpackage.wra wraVar2 = (defpackage.wra) akzxVarM5.p();
                    akzxVarM2.u();
                    defpackage.wqx wqxVar5 = (defpackage.wqx) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(wraVar2);
                    wqxVar5.d = wraVar2;
                    wqxVar5.c = 5;
                } else if (i5 == 7) {
                    a.bI(b.d(), "AmItem 'item' field not set", "com/android/dialer/xatu/impl/storage/XatuPersistedTreeConverter", "toXatuPersistedTreeItem", 'Y', "XatuPersistedTreeConverter.java", zct.b);
                }
                defpackage.wqx wqxVar6 = (defpackage.wqx) akzxVarM2.p();
                akzxVarM.u();
                defpackage.wqv wqvVar = (defpackage.wqv) akzxVarM.b;
                j$.util.Objects.requireNonNull(wqxVar6);
                alat alatVar = wqvVar.b;
                if (!alatVar.c()) {
                    wqvVar.b = alad.J(alatVar);
                }
                wqvVar.b.add(wqxVar6);
            }
        }
        return (defpackage.wqv) akzxVarM.p();
    }
}
