package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wih implements defpackage.utx {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/feedback/XatuFeedbackIntegration");
    public final wqr b;
    private final ajct c;
    private final ajct d;
    private final ahzi e;
    private final ahzi f;
    private final ahzi g;
    private final defpackage.wif h;

    public wih(ajct ajctVar, ajct ajctVar2, ops opsVar, wqr wqrVar, defpackage.wif wifVar, defpackage.wib wibVar) {
        this.c = ajctVar;
        this.d = ajctVar2;
        this.b = wqrVar;
        this.h = wifVar;
        this.e = ahvr.bI(new defpackage.wdn(opsVar, 12));
        this.f = ahvr.bI(new fff(opsVar, wibVar, 5, (byte[]) null));
        this.g = ahvr.bI(new defpackage.wdn(opsVar, 13));
    }

    @Override // defpackage.utx
    public final ajcq a(long j) {
        return ahrv.g(this.b.a(aify.p(java.lang.Long.valueOf(j)))).i(new defpackage.qgk(14), this.d);
    }

    @Override // defpackage.utx
    public final ajcq b(long j) {
        ahrv ahrvVarG = ahrv.g(this.b.c(j));
        vrx vrxVar = new vrx(20);
        ajct ajctVar = this.d;
        return ahrv.g(ahrvVarG.h(vrxVar, ajctVar)).i(new jwi(this, j, 13), ajctVar);
    }

    @Override // defpackage.utx
    public final ajcq c(defpackage.utu utuVar) {
        return ahrv.g(this.b.c(utuVar.c)).i(new defpackage.qgk(15), this.d);
    }

    @Override // defpackage.utx
    public final ajcq d(long j, java.lang.String str) {
        defpackage.wif wifVar = this.h;
        ahrv ahrvVarG = ahrv.g(wifVar.c.c(j));
        vrx vrxVar = new vrx(19);
        ajct ajctVar = wifVar.b;
        return ahrv.g(ahrvVarG.h(vrxVar, ajctVar)).h(new defpackage.wie(str, 0), ajctVar);
    }

    @Override // defpackage.utx
    public final ajcq e(long j) {
        return ahrv.g(this.b.c(j)).h(new defpackage.win(1), this.d);
    }

    @Override // defpackage.utx
    public final ajcq f(final defpackage.utu utuVar) {
        return ahrv.g(this.b.c(utuVar.c)).h(new ahyc() { // from class: wig
            /* JADX WARN: Code duplicated, block: B:62:0x01bf  */
            /* JADX WARN: Code duplicated, block: B:68:0x01ea  */
            public final java.lang.Object apply(java.lang.Object obj) {
                int i;
                boolean z;
                boolean z2;
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return aike.a;
                }
                aift aiftVar = new aift(4);
                defpackage.wqt wqtVar = ((defpackage.wqp) optional.orElseThrow()).e;
                if (wqtVar == null) {
                    wqtVar = defpackage.wqt.a;
                }
                defpackage.wqs wqsVar = wqtVar.c;
                if (wqsVar == null) {
                    wqsVar = defpackage.wqs.a;
                }
                for (defpackage.wrf wrfVar : wqsVar.c) {
                    if ((wrfVar.b & 4) != 0) {
                        try {
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(wrfVar.e);
                            try {
                                defpackage.wqv wqvVar = (defpackage.wqv) alad.A(defpackage.wqv.a, fileInputStream, akzq.a());
                                for (int i2 = 0; i2 < wqvVar.b.size(); i2++) {
                                    defpackage.wqx wqxVar = (defpackage.wqx) wqvVar.b.get(i2);
                                    int i3 = wqxVar.c;
                                    if (i3 == 0) {
                                        i = 4;
                                    } else if (i3 == 5) {
                                        i = 3;
                                    } else if (i3 != 2) {
                                        i = i3 != 3 ? 0 : 2;
                                    } else {
                                        i = 1;
                                    }
                                    if (i == 0) {
                                        throw null;
                                    }
                                    int i4 = i - 1;
                                    defpackage.utu utuVar2 = utuVar;
                                    if (i4 == 0) {
                                        akzx akzxVarM = defpackage.uva.a.m();
                                        alcf alcfVarE = aldi.e(wqxVar.f);
                                        akzxVarM.u();
                                        defpackage.uva uvaVar = (defpackage.uva) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(alcfVarE);
                                        uvaVar.e = alcfVarE;
                                        uvaVar.b |= 1;
                                        akzx akzxVarM2 = defpackage.uuy.a.m();
                                        java.lang.String str = (wqxVar.c == 2 ? (defpackage.wqz) wqxVar.d : defpackage.wqz.a).c;
                                        akzxVarM2.u();
                                        defpackage.uuy uuyVar = (defpackage.uuy) akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(str);
                                        uuyVar.b |= 1;
                                        uuyVar.c = str;
                                        boolean z3 = (wqxVar.c == 2 ? (defpackage.wqz) wqxVar.d : defpackage.wqz.a).d;
                                        akzxVarM2.u();
                                        defpackage.uuy uuyVar2 = (defpackage.uuy) akzxVarM2.b;
                                        uuyVar2.b |= 2;
                                        uuyVar2.d = z3;
                                        defpackage.abwd abwdVar = utuVar2.d;
                                        if (abwdVar == null) {
                                            abwdVar = defpackage.abwd.a;
                                        }
                                        akzxVarM2.u();
                                        defpackage.uuy uuyVar3 = (defpackage.uuy) akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(abwdVar);
                                        uuyVar3.e = abwdVar;
                                        uuyVar3.b |= 4;
                                        defpackage.uuy uuyVar4 = (defpackage.uuy) akzxVarM2.p();
                                        akzxVarM.u();
                                        defpackage.uva uvaVar2 = (defpackage.uva) akzxVarM.b;
                                        j$.util.Objects.requireNonNull(uuyVar4);
                                        uvaVar2.d = uuyVar4;
                                        uvaVar2.c = 5;
                                        aiftVar.i((defpackage.uva) akzxVarM.p());
                                    } else if (i4 == 1) {
                                        defpackage.wqy wqyVar = i3 == 3 ? (defpackage.wqy) wqxVar.d : defpackage.wqy.a;
                                        akzx akzxVarM3 = defpackage.uva.a.m();
                                        alcf alcfVarE2 = aldi.e(wqxVar.f);
                                        akzxVarM3.u();
                                        defpackage.uva uvaVar3 = (defpackage.uva) akzxVarM3.b;
                                        j$.util.Objects.requireNonNull(alcfVarE2);
                                        uvaVar3.e = alcfVarE2;
                                        uvaVar3.b |= 1;
                                        akzx akzxVarM4 = defpackage.uux.a.m();
                                        java.lang.String str2 = wqyVar.c;
                                        akzxVarM4.u();
                                        defpackage.uux uuxVar = (defpackage.uux) akzxVarM4.b;
                                        j$.util.Objects.requireNonNull(str2);
                                        uuxVar.b |= 1;
                                        uuxVar.c = str2;
                                        java.lang.String str3 = wqyVar.f;
                                        akzxVarM4.u();
                                        defpackage.uux uuxVar2 = (defpackage.uux) akzxVarM4.b;
                                        j$.util.Objects.requireNonNull(str3);
                                        uuxVar2.b |= 2;
                                        uuxVar2.d = str3;
                                        int iAN = a.aN(wqyVar.e);
                                        boolean z4 = iAN != 0 && iAN == 4;
                                        akzxVarM4.u();
                                        defpackage.uux uuxVar3 = (defpackage.uux) akzxVarM4.b;
                                        uuxVar3.b |= 4;
                                        uuxVar3.e = z4;
                                        boolean z5 = wqyVar.d;
                                        akzxVarM4.u();
                                        defpackage.uux uuxVar4 = (defpackage.uux) akzxVarM4.b;
                                        uuxVar4.b |= 16;
                                        uuxVar4.g = z5;
                                        defpackage.abwd abwdVar2 = utuVar2.d;
                                        if (abwdVar2 == null) {
                                            abwdVar2 = defpackage.abwd.a;
                                        }
                                        akzxVarM4.u();
                                        defpackage.uux uuxVar5 = (defpackage.uux) akzxVarM4.b;
                                        j$.util.Objects.requireNonNull(abwdVar2);
                                        uuxVar5.f = abwdVar2;
                                        uuxVar5.b |= 8;
                                        if (i2 == 0) {
                                            z = true;
                                        } else if (((defpackage.wqx) wqvVar.b.get(i2 - 1)).c == 3) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        akzxVarM4.u();
                                        defpackage.uux uuxVar6 = (defpackage.uux) akzxVarM4.b;
                                        uuxVar6.b |= 32;
                                        uuxVar6.h = z;
                                        if (i2 == wqvVar.b.size() - 1) {
                                            z2 = true;
                                        } else if (((defpackage.wqx) wqvVar.b.get(i2 + 1)).c == 3) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        akzxVarM4.u();
                                        defpackage.uux uuxVar7 = (defpackage.uux) akzxVarM4.b;
                                        uuxVar7.b |= 64;
                                        uuxVar7.i = z2;
                                        defpackage.uux uuxVar8 = (defpackage.uux) akzxVarM4.p();
                                        akzxVarM3.u();
                                        defpackage.uva uvaVar4 = (defpackage.uva) akzxVarM3.b;
                                        j$.util.Objects.requireNonNull(uuxVar8);
                                        uvaVar4.d = uuxVar8;
                                        uvaVar4.c = 6;
                                        aiftVar.i((defpackage.uva) akzxVarM3.p());
                                    } else if (i4 == 2) {
                                        defpackage.wra wraVar = i3 == 5 ? (defpackage.wra) wqxVar.d : defpackage.wra.a;
                                        akzx akzxVarM5 = defpackage.uva.a.m();
                                        alcf alcfVarE3 = aldi.e(wqxVar.f);
                                        akzxVarM5.u();
                                        defpackage.uva uvaVar5 = (defpackage.uva) akzxVarM5.b;
                                        j$.util.Objects.requireNonNull(alcfVarE3);
                                        uvaVar5.e = alcfVarE3;
                                        uvaVar5.b |= 1;
                                        akzx akzxVarM6 = defpackage.uuz.a.m();
                                        java.lang.String str4 = wraVar.c;
                                        akzxVarM6.u();
                                        defpackage.uuz uuzVar = (defpackage.uuz) akzxVarM6.b;
                                        j$.util.Objects.requireNonNull(str4);
                                        uuzVar.b |= 1;
                                        uuzVar.c = str4;
                                        boolean z6 = wraVar.d;
                                        akzxVarM6.u();
                                        defpackage.uuz uuzVar2 = (defpackage.uuz) akzxVarM6.b;
                                        uuzVar2.b |= 4;
                                        uuzVar2.e = z6;
                                        defpackage.abwd abwdVar3 = utuVar2.d;
                                        if (abwdVar3 == null) {
                                            abwdVar3 = defpackage.abwd.a;
                                        }
                                        akzxVarM6.u();
                                        defpackage.uuz uuzVar3 = (defpackage.uuz) akzxVarM6.b;
                                        j$.util.Objects.requireNonNull(abwdVar3);
                                        uuzVar3.d = abwdVar3;
                                        uuzVar3.b |= 2;
                                        defpackage.uuz uuzVar4 = (defpackage.uuz) akzxVarM6.p();
                                        akzxVarM5.u();
                                        defpackage.uva uvaVar6 = (defpackage.uva) akzxVarM5.b;
                                        j$.util.Objects.requireNonNull(uuzVar4);
                                        uvaVar6.d = uuzVar4;
                                        uvaVar6.c = 8;
                                        aiftVar.i((defpackage.uva) akzxVarM5.p());
                                    }
                                    throw new java.lang.IllegalStateException("Failed to read file", e);
                                }
                                fileInputStream.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    fileInputStream.close();
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (java.io.IOException e) {
                            throw new java.lang.IllegalStateException("Failed to read file", e);
                        }
                    }
                }
                return aiftVar.h();
            }
        }, this.c);
    }

    @Override // defpackage.utx
    public final /* synthetic */ ajcq g(long j) {
        return wsc.bl();
    }

    @Override // defpackage.utx
    public final /* synthetic */ ajcq h(long j) {
        return wsc.bm();
    }

    @Override // defpackage.utx
    public final /* synthetic */ j$.util.Optional i(long j) {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.utx
    public final j$.util.Optional j(defpackage.uuh uuhVar) {
        int iOrdinal = uuhVar.ordinal();
        if (iOrdinal == 3) {
            return j$.util.Optional.of((defpackage.ahao) this.e.eZ());
        }
        if (iOrdinal != 4) {
            return iOrdinal != 6 ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.ahao) this.g.eZ());
        }
        return j$.util.Optional.of((defpackage.ahao) this.f.eZ());
    }

    @Override // defpackage.utx
    public final /* synthetic */ ajcq k() {
        return wsc.bk();
    }

    @Override // defpackage.utx
    public final ajcq l(long j, int i) {
        akzx akzxVarM = defpackage.wgu.a.m();
        akzxVarM.u();
        defpackage.wgu wguVar = (defpackage.wgu) akzxVarM.b;
        wguVar.b |= 1;
        wguVar.c = false;
        akzxVarM.u();
        defpackage.wgu wguVar2 = (defpackage.wgu) akzxVarM.b;
        wguVar2.b |= 2;
        wguVar2.d = false;
        return this.b.d(j, (defpackage.wgu) akzxVarM.p());
    }
}
