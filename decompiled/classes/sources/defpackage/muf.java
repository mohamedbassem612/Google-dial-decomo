package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class muf {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader");
    public final defpackage.inv b;
    public final defpackage.ipc c;
    private final defpackage.aolr d;
    private final defpackage.mum e;

    public muf(defpackage.aolr aolrVar, defpackage.ipc ipcVar, defpackage.inv invVar, defpackage.mum mumVar) {
        defpackage.aooh.f(aolrVar, "backgroundContext");
        this.d = aolrVar;
        this.c = ipcVar;
        this.b = invVar;
        this.e = mumVar;
    }

    public static final defpackage.akzc c(java.io.File file) {
        try {
            defpackage.akzc akzcVarF = defpackage.akzc.F(new java.io.FileInputStream(file));
            defpackage.aooh.c(akzcVarF);
            return akzcVarF;
        } catch (java.io.IOException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader", "safeReadAllBytesFromFile", 186, "DobbyAudioDonationScottyUploader.kt")).y("Unable to load file %s", file.getName());
            defpackage.akzc akzcVar = defpackage.akzc.d;
            defpackage.aooh.c(akzcVar);
            return akzcVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x014b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0153  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:71:0x0177  */
    /* JADX WARN: Code duplicated, block: B:73:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object a(nsp nspVar, defpackage.aoln aolnVar) {
        muc mucVar;
        mun munVar;
        nst nstVar;
        nsq nsqVar;
        nso nsoVar;
        java.lang.Object objAj;
        nsp nspVar2;
        nst nstVar2;
        nsn nsnVar;
        defpackage.akzx akzxVarM;
        nsq nsqVar2;
        nsm nsmVar;
        nsq nsqVar3;
        nsq nsqVar4;
        nsm nsmVar2;
        nsq nsqVar5;
        nsq nsqVar6;
        nsm nsmVar3;
        nsm nsmVar4;
        nsm nsmVar5;
        utv utvVar;
        if (aolnVar instanceof muc) {
            mucVar = (muc) aolnVar;
            int i = mucVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mucVar.c = i - Integer.MIN_VALUE;
            } else {
                mucVar = new muc(this, aolnVar);
            }
        } else {
            mucVar = new muc(this, aolnVar);
        }
        java.lang.Object objAj2 = mucVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mucVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                nspVar = mucVar.d;
                defpackage.aooc.af(objAj2);
            } else if (i2 == 2) {
                mun munVar2 = mucVar.e;
                nsp nspVar3 = mucVar.d;
                defpackage.aooc.af(objAj2);
                munVar = munVar2;
                nspVar = nspVar3;
                nstVar = (nst) objAj2;
                nsqVar = nspVar.e;
                if (nsqVar == null) {
                    nsqVar = nsq.a;
                }
                nsoVar = nsqVar.c;
                if (nsoVar == null) {
                    nsoVar = nso.a;
                }
                defpackage.aooh.e(nsoVar, "getLogsInfo(...)");
                mucVar.d = nspVar;
                mucVar.e = munVar;
                mucVar.f = nstVar;
                mucVar.c = 3;
                objAj = defpackage.aoov.aj(this.d, new kdr(nsoVar, this, (defpackage.aoln) null, 10), mucVar);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nspVar2 = nspVar;
                nstVar2 = nstVar;
                objAj2 = objAj;
                defpackage.mum mumVar = this.e;
                nsnVar = (nsn) objAj2;
                akzxVarM = nsv.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                nsqVar2 = nspVar2.e;
                if (nsqVar2 == null) {
                    nsqVar2 = nsq.a;
                }
                nsmVar = nsqVar2.f;
                if (nsmVar == null) {
                    nsmVar = nsm.a;
                }
                java.lang.String str = nsmVar.d;
                defpackage.aooh.e(str, "getUploadId(...)");
                defpackage.aooh.f(str, "value");
                akzxVarM.u();
                nsv nsvVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                nsvVar.c = str;
                defpackage.aooh.f(nspVar2, "value");
                akzxVarM.u();
                nsv nsvVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(nspVar2);
                nsvVar2.d = nspVar2;
                nsvVar2.b |= 1;
                nsqVar3 = nspVar2.e;
                if (nsqVar3 == null) {
                    nsqVar4 = nsq.a;
                } else {
                    nsqVar4 = nsqVar3;
                }
                nsmVar2 = nsqVar4.f;
                if (nsmVar2 == null) {
                    nsmVar2 = nsm.a;
                }
                if ((nsmVar2.b & 512) != 0) {
                    if (nsqVar3 == null) {
                        nsqVar3 = nsq.a;
                    }
                    nsmVar5 = nsqVar3.f;
                    if (nsmVar5 == null) {
                        nsmVar5 = nsm.a;
                    }
                    utvVar = nsmVar5.l;
                    if (utvVar == null) {
                        utvVar = utv.a;
                    }
                    defpackage.aooh.e(utvVar, "getFeedbackOriginMessage(...)");
                    defpackage.aooh.f(utvVar, "value");
                    akzxVarM.u();
                    nsv nsvVar3 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(utvVar);
                    nsvVar3.h = utvVar;
                    nsvVar3.b |= 16;
                }
                if (nstVar2 != null) {
                    akzxVarM.u();
                    nsv nsvVar4 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(nstVar2);
                    nsvVar4.e = nstVar2;
                    nsvVar4.b |= 2;
                }
                if (nsnVar != null) {
                    akzxVarM.u();
                    nsv nsvVar5 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(nsnVar);
                    nsvVar5.f = nsnVar;
                    nsvVar5.b |= 4;
                }
                nsqVar5 = nspVar2.e;
                if (nsqVar5 == null) {
                    nsqVar6 = nsq.a;
                } else {
                    nsqVar6 = nsqVar5;
                }
                nsmVar3 = nsqVar6.f;
                if (nsmVar3 == null) {
                    nsmVar3 = nsm.a;
                }
                if ((nsmVar3.b & 256) != 0) {
                    if (nsqVar5 == null) {
                        nsqVar5 = nsq.a;
                    }
                    nsmVar4 = nsqVar5.f;
                    if (nsmVar4 == null) {
                        nsmVar4 = nsm.a;
                    }
                    java.lang.String str2 = nsmVar4.k;
                    defpackage.aooh.e(str2, "getNormalizedPhoneNumber(...)");
                    defpackage.aooh.f(str2, "value");
                    akzxVarM.u();
                    nsv nsvVar6 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str2);
                    nsvVar6.b |= 8;
                    nsvVar6.g = str2;
                }
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                mucVar.d = null;
                mucVar.e = null;
                mucVar.f = null;
                mucVar.c = 4;
                objAj2 = mumVar.a(munVar, (nsv) aladVarR, mucVar);
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                nstVar2 = mucVar.f;
                munVar = mucVar.e;
                nspVar2 = mucVar.d;
                defpackage.aooc.af(objAj2);
                defpackage.mum mumVar2 = this.e;
                nsnVar = (nsn) objAj2;
                akzxVarM = nsv.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                nsqVar2 = nspVar2.e;
                if (nsqVar2 == null) {
                    nsqVar2 = nsq.a;
                }
                nsmVar = nsqVar2.f;
                if (nsmVar == null) {
                    nsmVar = nsm.a;
                }
                java.lang.String str3 = nsmVar.d;
                defpackage.aooh.e(str3, "getUploadId(...)");
                defpackage.aooh.f(str3, "value");
                akzxVarM.u();
                nsv nsvVar7 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                nsvVar7.c = str3;
                defpackage.aooh.f(nspVar2, "value");
                akzxVarM.u();
                nsv nsvVar8 = akzxVarM.b;
                j$.util.Objects.requireNonNull(nspVar2);
                nsvVar8.d = nspVar2;
                nsvVar8.b |= 1;
                nsqVar3 = nspVar2.e;
                if (nsqVar3 == null) {
                    nsqVar4 = nsq.a;
                } else {
                    nsqVar4 = nsqVar3;
                }
                nsmVar2 = nsqVar4.f;
                if (nsmVar2 == null) {
                    nsmVar2 = nsm.a;
                }
                if ((nsmVar2.b & 512) != 0) {
                    if (nsqVar3 == null) {
                        nsqVar3 = nsq.a;
                    }
                    nsmVar5 = nsqVar3.f;
                    if (nsmVar5 == null) {
                        nsmVar5 = nsm.a;
                    }
                    utvVar = nsmVar5.l;
                    if (utvVar == null) {
                        utvVar = utv.a;
                    }
                    defpackage.aooh.e(utvVar, "getFeedbackOriginMessage(...)");
                    defpackage.aooh.f(utvVar, "value");
                    akzxVarM.u();
                    nsv nsvVar9 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(utvVar);
                    nsvVar9.h = utvVar;
                    nsvVar9.b |= 16;
                }
                if (nstVar2 != null) {
                    akzxVarM.u();
                    nsv nsvVar10 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(nstVar2);
                    nsvVar10.e = nstVar2;
                    nsvVar10.b |= 2;
                }
                if (nsnVar != null) {
                    akzxVarM.u();
                    nsv nsvVar11 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(nsnVar);
                    nsvVar11.f = nsnVar;
                    nsvVar11.b |= 4;
                }
                nsqVar5 = nspVar2.e;
                if (nsqVar5 == null) {
                    nsqVar6 = nsq.a;
                } else {
                    nsqVar6 = nsqVar5;
                }
                nsmVar3 = nsqVar6.f;
                if (nsmVar3 == null) {
                    nsmVar3 = nsm.a;
                }
                if ((nsmVar3.b & 256) != 0) {
                    if (nsqVar5 == null) {
                        nsqVar5 = nsq.a;
                    }
                    nsmVar4 = nsqVar5.f;
                    if (nsmVar4 == null) {
                        nsmVar4 = nsm.a;
                    }
                    java.lang.String str4 = nsmVar4.k;
                    defpackage.aooh.e(str4, "getNormalizedPhoneNumber(...)");
                    defpackage.aooh.f(str4, "value");
                    akzxVarM.u();
                    nsv nsvVar12 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str4);
                    nsvVar12.b |= 8;
                    nsvVar12.g = str4;
                }
                defpackage.alad aladVarR2 = akzxVarM.r();
                defpackage.aooh.e(aladVarR2, "build(...)");
                mucVar.d = null;
                mucVar.e = null;
                mucVar.f = null;
                mucVar.c = 4;
                objAj2 = mumVar2.a(munVar, (nsv) aladVarR2, mucVar);
                if (objAj2 == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objAj2);
            }
            return java.lang.Boolean.valueOf(((apjb) objAj2).m());
        }
        defpackage.aooc.af(objAj2);
        ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/feedback/upload/DobbyAudioDonationScottyUploader", "donateAudioAndMetrics", 49, "DobbyAudioDonationScottyUploader.kt")).x("sending metrics for call %s", nspVar.c);
        nsq nsqVar7 = nspVar.e;
        if (nsqVar7 == null) {
            nsqVar7 = nsq.a;
        }
        nsl nslVar = nsqVar7.e;
        if (nslVar == null) {
            nslVar = nsl.a;
        }
        defpackage.aooh.e(nslVar, "getAudioInfo(...)");
        mucVar.d = nspVar;
        mucVar.c = 1;
        objAj2 = defpackage.aoov.aj(this.d, new mud(nslVar, this, (defpackage.aoln) null), mucVar);
        if (objAj2 == aoluVar) {
            return aoluVar;
        }
        mun munVar3 = (mun) objAj2;
        nsq nsqVar8 = nspVar.e;
        if (nsqVar8 == null) {
            nsqVar8 = nsq.a;
        }
        nss nssVar = nsqVar8.d;
        if (nssVar == null) {
            nssVar = nss.a;
        }
        defpackage.aooh.e(nssVar, "getTranscriptInfo(...)");
        mucVar.d = nspVar;
        mucVar.e = munVar3;
        mucVar.c = 2;
        java.lang.Object objAj3 = defpackage.aoov.aj(this.d, new kdr(nssVar, this, (defpackage.aoln) null, 11), mucVar);
        if (objAj3 == aoluVar) {
            return aoluVar;
        }
        munVar = munVar3;
        objAj2 = objAj3;
        nstVar = (nst) objAj2;
        nsqVar = nspVar.e;
        if (nsqVar == null) {
            nsqVar = nsq.a;
        }
        nsoVar = nsqVar.c;
        if (nsoVar == null) {
            nsoVar = nso.a;
        }
        defpackage.aooh.e(nsoVar, "getLogsInfo(...)");
        mucVar.d = nspVar;
        mucVar.e = munVar;
        mucVar.f = nstVar;
        mucVar.c = 3;
        objAj = defpackage.aoov.aj(this.d, new kdr(nsoVar, this, (defpackage.aoln) null, 10), mucVar);
        if (objAj != aoluVar) {
            return aoluVar;
        }
        nspVar2 = nspVar;
        nstVar2 = nstVar;
        objAj2 = objAj;
        defpackage.mum mumVar3 = this.e;
        nsnVar = (nsn) objAj2;
        akzxVarM = nsv.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        nsqVar2 = nspVar2.e;
        if (nsqVar2 == null) {
            nsqVar2 = nsq.a;
        }
        nsmVar = nsqVar2.f;
        if (nsmVar == null) {
            nsmVar = nsm.a;
        }
        java.lang.String str5 = nsmVar.d;
        defpackage.aooh.e(str5, "getUploadId(...)");
        defpackage.aooh.f(str5, "value");
        akzxVarM.u();
        nsv nsvVar13 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str5);
        nsvVar13.c = str5;
        defpackage.aooh.f(nspVar2, "value");
        akzxVarM.u();
        nsv nsvVar14 = akzxVarM.b;
        j$.util.Objects.requireNonNull(nspVar2);
        nsvVar14.d = nspVar2;
        nsvVar14.b |= 1;
        nsqVar3 = nspVar2.e;
        if (nsqVar3 == null) {
            nsqVar4 = nsq.a;
        } else {
            nsqVar4 = nsqVar3;
        }
        nsmVar2 = nsqVar4.f;
        if (nsmVar2 == null) {
            nsmVar2 = nsm.a;
        }
        if ((nsmVar2.b & 512) != 0) {
            if (nsqVar3 == null) {
                nsqVar3 = nsq.a;
            }
            nsmVar5 = nsqVar3.f;
            if (nsmVar5 == null) {
                nsmVar5 = nsm.a;
            }
            utvVar = nsmVar5.l;
            if (utvVar == null) {
                utvVar = utv.a;
            }
            defpackage.aooh.e(utvVar, "getFeedbackOriginMessage(...)");
            defpackage.aooh.f(utvVar, "value");
            akzxVarM.u();
            nsv nsvVar15 = akzxVarM.b;
            j$.util.Objects.requireNonNull(utvVar);
            nsvVar15.h = utvVar;
            nsvVar15.b |= 16;
        }
        if (nstVar2 != null) {
            akzxVarM.u();
            nsv nsvVar16 = akzxVarM.b;
            j$.util.Objects.requireNonNull(nstVar2);
            nsvVar16.e = nstVar2;
            nsvVar16.b |= 2;
        }
        if (nsnVar != null) {
            akzxVarM.u();
            nsv nsvVar17 = akzxVarM.b;
            j$.util.Objects.requireNonNull(nsnVar);
            nsvVar17.f = nsnVar;
            nsvVar17.b |= 4;
        }
        nsqVar5 = nspVar2.e;
        if (nsqVar5 == null) {
            nsqVar6 = nsq.a;
        } else {
            nsqVar6 = nsqVar5;
        }
        nsmVar3 = nsqVar6.f;
        if (nsmVar3 == null) {
            nsmVar3 = nsm.a;
        }
        if ((nsmVar3.b & 256) != 0) {
            if (nsqVar5 == null) {
                nsqVar5 = nsq.a;
            }
            nsmVar4 = nsqVar5.f;
            if (nsmVar4 == null) {
                nsmVar4 = nsm.a;
            }
            java.lang.String str6 = nsmVar4.k;
            defpackage.aooh.e(str6, "getNormalizedPhoneNumber(...)");
            defpackage.aooh.f(str6, "value");
            akzxVarM.u();
            nsv nsvVar18 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str6);
            nsvVar18.b |= 8;
            nsvVar18.g = str6;
        }
        defpackage.alad aladVarR3 = akzxVarM.r();
        defpackage.aooh.e(aladVarR3, "build(...)");
        mucVar.d = null;
        mucVar.e = null;
        mucVar.f = null;
        mucVar.c = 4;
        objAj2 = mumVar3.a(munVar, (nsv) aladVarR3, mucVar);
        if (objAj2 == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(((apjb) objAj2).m());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.String str, defpackage.aoln aolnVar) {
        mue mueVar;
        if (aolnVar instanceof mue) {
            mueVar = (mue) aolnVar;
            int i = mueVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mueVar.c = i - Integer.MIN_VALUE;
            } else {
                mueVar = new mue(this, aolnVar);
            }
        } else {
            mueVar = new mue(this, aolnVar);
        }
        java.lang.Object objAj = mueVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = mueVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.aolr aolrVar = this.d;
            kdr kdrVar = new kdr(str, this, (defpackage.aoln) null, 12);
            mueVar.c = 1;
            objAj = defpackage.aoov.aj(aolrVar, kdrVar, mueVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        defpackage.aooh.e(objAj, "withContext(...)");
        return objAj;
    }
}
