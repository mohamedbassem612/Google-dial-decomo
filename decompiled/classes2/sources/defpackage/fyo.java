package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fyo extends gcf {
    final /* synthetic */ defpackage.fyr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyo(defpackage.fyr fyrVar, aolr aolrVar) {
        super(aolrVar, (kgl) null);
        this.a = fyrVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object a(dzn dznVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.fym fymVar;
        int i;
        int i2;
        gca gcaVar;
        defpackage.fyr fyrVar;
        int iV;
        int iA;
        if (aolnVar instanceof defpackage.fym) {
            fymVar = (defpackage.fym) aolnVar;
            int i3 = fymVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fymVar.c = i3 - Integer.MIN_VALUE;
            } else {
                fymVar = new defpackage.fym(this, aolnVar);
            }
        } else {
            fymVar = new defpackage.fym(this, aolnVar);
        }
        java.lang.Object obj = fymVar.a;
        aolu aoluVar = aolu.a;
        int i4 = fymVar.c;
        if (i4 == 0) {
            aooc.af(obj);
            if (dznVar instanceof gca) {
                defpackage.fyr fyrVar2 = this.a;
                gcaVar = (gca) dznVar;
                gcr gcrVar = gcaVar.b;
                if (gcrVar.e() == 0) {
                    gcr gcrVar2 = gcaVar.a;
                    if (gcrVar2.e() > 0) {
                        fyrVar2.a.b(0, gcrVar2.e());
                    }
                } else if (gcaVar.a.e() == 0) {
                    gcr gcrVar3 = gcaVar.b;
                    if (gcrVar3.e() > 0) {
                        fyrVar2.a.d(0, gcrVar3.e());
                    }
                } else {
                    fyrVar2.d.set(gcrVar);
                    try {
                        aolr aolrVar = fyrVar2.b;
                        defpackage.fyn fynVar = new defpackage.fyn(gcaVar, fyrVar2, (aoln) null, 0);
                        fymVar.d = fyrVar2;
                        fymVar.e = gcaVar;
                        fymVar.c = 1;
                        java.lang.Object objAj = aoov.aj(aolrVar, fynVar, fymVar);
                        if (objAj == aoluVar) {
                            return aoluVar;
                        }
                        fyrVar = fyrVar2;
                        obj = objAj;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fyrVar = fyrVar2;
                        fyrVar.d.set(null);
                        throw th;
                    }
                }
            } else if (dznVar instanceof defpackage.gbz) {
                defpackage.fyr fyrVar3 = this.a;
                defpackage.gbz gbzVar = (defpackage.gbz) dznVar;
                int size = gbzVar.a.size();
                int i5 = gbzVar.c;
                int iMin = java.lang.Math.min(i5, size);
                int i6 = i5 - iMin;
                int i7 = size - iMin;
                if (iMin > 0) {
                    fyrVar3.a.a(i6, iMin, null);
                }
                if (i7 > 0) {
                    i2 = 0;
                    fyrVar3.a.b(0, i7);
                } else {
                    i2 = 0;
                }
                int i8 = (gbzVar.b - i5) + iMin;
                if (i8 > 0) {
                    fyrVar3.a.b(i2, i8);
                } else if (i8 < 0) {
                    fyrVar3.a.d(i2, -i8);
                }
            } else if (dznVar instanceof defpackage.gbw) {
                defpackage.fyr fyrVar4 = this.a;
                defpackage.gbw gbwVar = (defpackage.gbw) dznVar;
                int size2 = gbwVar.b.size();
                int i9 = gbwVar.d;
                int iMin2 = java.lang.Math.min(i9, size2);
                int i10 = gbwVar.a;
                int i11 = size2 - iMin2;
                int i12 = i10 + iMin2;
                if (iMin2 > 0) {
                    fyrVar4.a.a(i10, iMin2, null);
                }
                if (i11 > 0) {
                    fyrVar4.a.b(i12, i11);
                }
                int i13 = gbwVar.c;
                int i14 = (i13 - i9) + iMin2;
                int i15 = i10 + size2 + i13;
                if (i14 > 0) {
                    fyrVar4.a.b(i15 - i14, i14);
                } else if (i14 < 0) {
                    fyrVar4.a.d(i15, -i14);
                }
            } else if (dznVar instanceof defpackage.gby) {
                defpackage.fyr fyrVar5 = this.a;
                defpackage.gby gbyVar = (defpackage.gby) dznVar;
                int i16 = gbyVar.b;
                int i17 = i16 - gbyVar.a;
                int i18 = gbyVar.c;
                int i19 = i17 - i18;
                if (i19 > 0) {
                    i = 0;
                    fyrVar5.a.b(0, i19);
                } else {
                    i = 0;
                    if (i19 < 0) {
                        fyrVar5.a.d(0, -i19);
                    }
                }
                int iMax = java.lang.Math.max(i, i18 + i19);
                int i20 = i16 - iMax;
                if (i20 > 0) {
                    fyrVar5.a.a(iMax, i20, null);
                }
            } else {
                if (!(dznVar instanceof defpackage.gbx)) {
                    throw new aois();
                }
                defpackage.fyr fyrVar6 = this.a;
                defpackage.gbx gbxVar = (defpackage.gbx) dznVar;
                int i21 = gbxVar.c;
                int i22 = i21 - gbxVar.b;
                int i23 = gbxVar.d;
                int i24 = i22 - i23;
                int i25 = gbxVar.a;
                int i26 = i25 + i21;
                if (i24 > 0) {
                    fyrVar6.a.b(i26 - i24, i24);
                } else if (i24 < 0) {
                    fyrVar6.a.d(i26, -i24);
                }
                int iMin3 = (i21 - i23) + (i24 < 0 ? java.lang.Math.min(i23, -i24) : 0);
                if (iMin3 > 0) {
                    fyrVar6.a.a(i25, iMin3, null);
                }
            }
            return aojh.a;
        }
        if (i4 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gcaVar = fymVar.e;
        fyrVar = fymVar.d;
        try {
            aooc.af(obj);
        } catch (java.lang.Throwable th2) {
            th = th2;
            fyrVar.d.set(null);
            throw th;
        }
        akwb akwbVar = (akwb) obj;
        fyrVar.d.set(null);
        gbo gboVar = gcaVar.b;
        defpackage.ew ewVar = fyrVar.a;
        gcr gcrVar4 = gcaVar.a;
        aooh.f(gboVar, "<this>");
        aooh.f(akwbVar, "diffResult");
        boolean z = akwbVar.b;
        if (z) {
            aooh.f(gboVar, "oldList");
            aooh.f(akwbVar, "diffResult");
            defpackage.gad gadVar = new defpackage.gad(gboVar, gcrVar4, ewVar);
            ((defpackage.es) akwbVar.a).b(gadVar);
            gbo gboVar2 = gadVar.a;
            gbo gboVar3 = gboVar2;
            int iMin4 = java.lang.Math.min(gboVar3.c, gadVar.d);
            gbo gboVar4 = gadVar.b;
            int i27 = gboVar4.c - gadVar.d;
            if (i27 > 0) {
                if (iMin4 > 0) {
                    gadVar.c.a(0, iMin4, defpackage.fzi.c);
                }
                gadVar.c.b(0, i27);
            } else {
                gcrVar4 = gcrVar4;
                if (i27 < 0) {
                    defpackage.ew ewVar2 = gadVar.c;
                    ewVar2.d(0, -i27);
                    int i28 = iMin4 + i27;
                    if (i28 > 0) {
                        ewVar2.a(0, i28, defpackage.fzi.c);
                    }
                }
            }
            gadVar.d = gboVar4.c;
            int iMin5 = java.lang.Math.min(gboVar3.d, gadVar.e);
            int i29 = gboVar4.d;
            int i30 = gadVar.e;
            int i31 = i29 - i30;
            int i32 = gadVar.d + gadVar.f + i30;
            int i33 = i32 - iMin5;
            int iE = gboVar2.e() - iMin5;
            if (i31 > 0) {
                gadVar.c.b(i32, i31);
            } else if (i31 < 0) {
                gadVar.c.d(i32 + i31, -i31);
                iMin5 += i31;
            }
            if (iMin5 > 0 && i33 != iE) {
                gadVar.c.a(i33, iMin5, defpackage.fzi.c);
            }
            gadVar.e = gboVar4.d;
        } else {
            gcrVar4 = gcrVar4;
            aooh.f(gboVar, "oldList");
            gbo gboVar5 = gboVar;
            gbo gboVar6 = (gbo) gcrVar4;
            int iMax2 = java.lang.Math.max(gboVar5.c, gboVar6.c);
            int iMin6 = java.lang.Math.min(gboVar5.c + gboVar5.b, gboVar6.c + gboVar6.b);
            int i34 = iMin6 - iMax2;
            if (i34 > 0) {
                ewVar.d(iMax2, i34);
                ewVar.b(iMax2, i34);
            }
            int iMin7 = java.lang.Math.min(iMax2, iMin6);
            int iMax3 = java.lang.Math.max(iMax2, iMin6);
            int i35 = gboVar5.c;
            defpackage.hgu.X(ewVar, iMin7, iMax3, aooc.u(i35, gcrVar4.e()), aooc.u(i35 + gboVar5.b, gcrVar4.e()), defpackage.fzi.a);
            defpackage.hgu.X(ewVar, iMin7, iMax3, aooc.u(gboVar6.c, gboVar.e()), aooc.u(gboVar6.c + gboVar6.b, gboVar.e()), defpackage.fzi.b);
            int iE2 = gcrVar4.e() - gboVar.e();
            if (iE2 > 0) {
                ewVar.b(gboVar.e(), iE2);
            } else if (iE2 < 0) {
                ewVar.d(gboVar.e() + iE2, -iE2);
            }
        }
        int i36 = fyrVar.c;
        aooh.f(gboVar, "<this>");
        aooh.f(akwbVar, "diffResult");
        if (z) {
            gbo gboVar7 = gboVar;
            int i37 = i36 - gboVar7.c;
            int i38 = gboVar7.b;
            if (i37 >= 0 && i37 < i38) {
                int i39 = 0;
                while (true) {
                    if (i39 >= 30) {
                        iV = aooc.v(i36, aooc.C(0, gcrVar4.e()));
                        break;
                    }
                    int i40 = ((i39 / 2) * (i39 % 2 == 1 ? -1 : 1)) + i37;
                    if (i40 >= 0 && i40 < gboVar7.b && (iA = ((defpackage.es) akwbVar.a).a(i40)) != -1) {
                        iV = ((gbo) gcrVar4).c + iA;
                        break;
                    }
                    i39++;
                }
            } else {
                iV = aooc.v(i36, aooc.C(0, gcrVar4.e()));
                break;
            }
        } else {
            iV = aooc.v(i36, aooc.C(0, gcrVar4.e()));
        }
        fyrVar.c = iV;
        c(iV);
        return aojh.a;
    }
}
