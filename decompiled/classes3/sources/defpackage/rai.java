package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rai {
    public final /* synthetic */ java.lang.Object a;

    public rai(hio hioVar) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public final void a(android.content.Intent intent) {
        ((defpackage.qki) this.a).a(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object b(defpackage.qit qitVar, aoln aolnVar) {
        defpackage.qjg qjgVar;
        if (aolnVar instanceof defpackage.qjg) {
            qjgVar = (defpackage.qjg) aolnVar;
            int i = qjgVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qjgVar.b = i - Integer.MIN_VALUE;
            } else {
                qjgVar = new defpackage.qjg(this, aolnVar);
            }
        } else {
            qjgVar = new defpackage.qjg(this, aolnVar);
        }
        java.lang.Object objD = qjgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = qjgVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            amzg amzgVar = (amzg) this.a.get(qitVar);
            if (amzgVar == null) {
                return null;
            }
            ajcq ajcqVarD = amzgVar.d();
            qjgVar.b = 1;
            objD = aosv.D(ajcqVarD, qjgVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mlr] */
    public final void c() {
        this.a.a();
    }

    public final void d(int i) {
        ((lyi) this.a).m.getWindow().setStatusBarColor(i);
    }

    public final void e() {
        hhe.K((android.content.Context) this.a).bt().n(rmw.jY);
    }

    public final void f() {
        kxx.a.b().l("com/android/dialer/callrecording/impl/service/CallRecordingButtonController$5", "onCallRecordingComplete", 378, "CallRecordingButtonController.java").v("recording completed.");
        kxx kxxVar = (kxx) this.a;
        kxxVar.h.set(true);
        kxxVar.j.set(j$.util.Optional.of(kxw.b));
        kxxVar.n.a(ajcm.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(java.lang.Object obj, aoln aolnVar) {
        jge jgeVar;
        java.lang.Object obj2;
        icb icbVar;
        if (aolnVar instanceof jge) {
            jgeVar = (jge) aolnVar;
            int i = jgeVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jgeVar.b = i - Integer.MIN_VALUE;
            } else {
                jgeVar = new jge(this, aolnVar);
            }
        } else {
            jgeVar = new jge(this, aolnVar);
        }
        jge jgeVar2 = jgeVar;
        java.lang.Object obj3 = jgeVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = jgeVar2.b;
        if (i2 == 0) {
            aooc.af(obj3);
            java.lang.Object obj4 = this.a;
            java.lang.Throwable thC = aoiw.c(obj);
            if (thC == null) {
                icb icbVar2 = (icb) obj;
                jgk jgkVar = (jgk) obj4;
                kgl kglVar = jgkVar.w;
                ity ityVar = new ity(jgkVar.g);
                java.lang.String str = jgkVar.f;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                java.lang.String absolutePath = icbVar2.a.getAbsolutePath();
                aooh.e(absolutePath, "getAbsolutePath(...)");
                jgeVar2.c = jgkVar;
                jgeVar2.d = icbVar2;
                jgeVar2.b = 1;
                if (kglVar.w(ityVar, str, epochMilli, absolutePath, jgeVar2) == aoluVar) {
                    return aoluVar;
                }
                obj2 = obj4;
                icbVar = icbVar2;
            } else {
                jgk.a.d().l("com/android/dialer/beesly/impl/v2/service/session/BeeslySessionV2", "recorder$<anonymous>$<anonymous>$<anonymous>", 160, "BeeslySessionV2.kt").u(thC);
                jgk jgkVar2 = (jgk) obj4;
                jgkVar2.q.a(qbc.ou);
                jgkVar2.s.e(java.lang.Boolean.TRUE);
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        icbVar = jgeVar2.d;
        obj2 = jgeVar2.c;
        aooc.af(obj3);
        jgk jgkVar3 = (jgk) obj2;
        jgkVar3.q.a(qbc.ot);
        aoov.an(jgkVar3.i, (aolr) null, 0, new jcu(jgkVar3, icbVar, (aoln) null, 5), 3);
        jgkVar3.s.e(java.lang.Boolean.TRUE);
        return aojh.a;
    }

    public final /* bridge */ /* synthetic */ void h(java.lang.Object obj, float f, boolean z) {
        ifq ifqVar = (ifq) this.a;
        android.widget.TextView textView = ifqVar.f;
        long j = (long) f;
        java.lang.String strF = ifq.f(j);
        if (!aooh.n(strF, textView.getText())) {
            textView.setText(strF);
        }
        if (z) {
            ifqVar.g(3);
            iek iekVar = ifqVar.k;
            if (iekVar != null) {
                ied iedVar = iekVar.c;
                if (iedVar == null) {
                    iedVar = ied.a;
                }
                if (iedVar != null) {
                    iez iezVar = ifqVar.d;
                    if (iezVar.s(iedVar)) {
                        iezVar.p(j);
                    }
                    ifqVar.d(f);
                }
            }
        }
    }

    public final defpackage.afoh i(android.accounts.Account account, java.lang.String str, boolean z) {
        hip hipVar = ((hjq) this.a).a.a;
        return new defpackage.afoh(hipVar.bd(), hipVar.au(), account, str, z);
    }

    public final ktu j(android.content.Intent intent, zzd zzdVar, java.lang.String str) {
        him himVar = ((hjc) this.a).a;
        return new ktu(intent, zzdVar, str, (android.content.Context) himVar.s.a(), himVar.dK());
    }

    public final org k(defpackage.zrx zrxVar, mce mceVar, java.util.List list) {
        him himVar = ((hio) this.a).a;
        return new org(zrxVar, mceVar, list, (android.content.Context) himVar.s.a(), himVar.oV(), (gpd) himVar.fD.a(), (rlv) himVar.fq.a(), (ahpz) himVar.bb.a());
    }

    public final /* bridge */ /* synthetic */ zas l(java.lang.String str) {
        return new zaz(str, (zbm) ((hil) this.a).a.go.a());
    }

    public final iaj m(hzh hzhVar) {
        him himVar = ((hil) this.a).a;
        return new iaj(hzhVar, (iao) himVar.Hq.a(), (ajcu) himVar.Ha.a(), (aazc) himVar.l.a());
    }

    public final defpackage.uxh n(defpackage.uwu uwuVar) {
        him himVar = ((hil) this.a).a;
        return new defpackage.uxh(uwuVar, (aoss) himVar.cb.a(), new defpackage.uxm((android.content.Context) himVar.s.a(), (aolr) himVar.ca.a(), himVar.zZ), new defpackage.uxk((android.content.Context) himVar.s.a(), (aolr) himVar.bg.a(), (aazc) himVar.l.a()), (rlv) himVar.fq.a());
    }

    public final ahbq o(ahav ahavVar, aonj aonjVar, java.util.concurrent.Executor executor, java.util.Map map, aonn aonnVar, aonj aonjVar2, ajat ajatVar, aomy aomyVar, java.util.Set set) {
        him himVar = ((hil) this.a).a;
        return new ahbq((android.content.Context) himVar.s.a(), (defpackage.rai) himVar.bw.a(), (java.util.Map) himVar.bx.a(), (apnt) himVar.aG.a(), (ajct) himVar.as.a(), (aogc) himVar.bq.a(), (ahyn) himVar.by.a(), (java.util.Map) himVar.bz.a(), ahavVar, aonjVar, executor, map, aonnVar, aonjVar2, ajatVar, aomyVar, set);
    }

    public final kpw p(defpackage.yse yseVar) {
        return new kpw(yseVar, (ni) ((hil) this.a).a.lB.a());
    }

    public final /* bridge */ /* synthetic */ defpackage.abaq q(aazd aazdVar) {
        him himVar = ((hil) this.a).a;
        return new defpackage.abaq(aazdVar, (acwi) himVar.ll.a(), (aify) himVar.lm.a(), (aogc) himVar.iV.a(), (abaj) himVar.ln.a(), new defpackage.afpl(j$.util.Optional.empty(), him.iX()));
    }

    public final /* bridge */ /* synthetic */ defpackage.tqf r(defpackage.tnq tnqVar) {
        hii hiiVar = ((hih) this.a).b;
        him himVar = hiiVar.a;
        return new defpackage.tqf(new defpackage.zlr((aolr) himVar.ca.a(), new zzx(himVar.Lu), new zzx(hiiVar.bO), (tmi) himVar.lh.a()), new defpackage.tqd((aolr) himVar.ca.a(), (defpackage.pqo) hiiVar.w.a(), (ojo) himVar.oF.a(), (tmi) himVar.lh.a(), (aogc) himVar.kz.a(), (defpackage.afpl) hiiVar.f.a()), (defpackage.rai) hiiVar.bP.a(), tnqVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: era */
    public final void s(int i, long j) throws era {
        java.lang.Object obj = this.a;
        if (i == 136) {
            ((fpe) obj).j(i).ab = j == 1;
            return;
        }
        if (i == 137) {
            ((fpe) obj).i(i).e = j;
            return;
        }
        if (i == 145) {
            ((fpe) obj).i(i).b = j;
            return;
        }
        if (i == 146) {
            ((fpe) obj).i(i).c = j;
            return;
        }
        if (i == 240) {
            fpe fpeVar = (fpe) obj;
            if (fpeVar.k) {
                return;
            }
            fpeVar.k(i);
            if (fpeVar.r == -1) {
                fpeVar.r = j;
                return;
            }
            return;
        }
        if (i == 241) {
            fpe fpeVar2 = (fpe) obj;
            if (fpeVar2.k) {
                return;
            }
            fpeVar2.k(i);
            if (fpeVar2.q == -1) {
                fpeVar2.q = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j != 0) {
                throw new era(a.bC(j, "ContentEncodingOrder ", " not supported"), (java.lang.Throwable) null, true, 1);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw new era(a.bC(j, "ContentEncodingScope ", " not supported"), (java.lang.Throwable) null, true, 1);
            }
            return;
        }
        if (i == 29636) {
            ((fpe) obj).i(i).a = j;
            return;
        }
        if (i == 29637) {
            ((fpe) obj).j(i).e = j;
            return;
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    ((fpe) obj).j(i).f = 2;
                    return;
                }
                if (i2 == 2) {
                    ((fpe) obj).j(i).f = 1;
                    return;
                }
                if (i2 == 17) {
                    ((fpe) obj).j(i).f = 3;
                    return;
                } else if (i2 != 33) {
                    ((fpe) obj).j(i).f = -1;
                    return;
                } else {
                    ((fpe) obj).j(i).f = 5;
                    return;
                }
            case 152:
                ((fpe) obj).i(i).d = j == 1;
                return;
            case 155:
                fpe fpeVar3 = (fpe) obj;
                fpeVar3.w = fpeVar3.h(j);
                return;
            case 159:
                ((fpe) obj).j(i).Q = (int) j;
                return;
            case 176:
                ((fpe) obj).j(i).o = (int) j;
                return;
            case 179:
                fpe fpeVar4 = (fpe) obj;
                if (fpeVar4.k) {
                    return;
                }
                fpeVar4.k(i);
                fpeVar4.o = fpeVar4.h(j);
                return;
            case 186:
                ((fpe) obj).j(i).p = (int) j;
                return;
            case 215:
                ((fpe) obj).j(i).d = (int) j;
                return;
            case 231:
                fpe fpeVar5 = (fpe) obj;
                fpeVar5.v = fpeVar5.h(j);
                return;
            case 238:
                ((fpe) obj).x = (int) j;
                return;
            case 247:
                fpe fpeVar6 = (fpe) obj;
                if (fpeVar6.k) {
                    return;
                }
                fpeVar6.k(i);
                fpeVar6.p = (int) j;
                return;
            case 251:
                ((fpe) obj).y = true;
                return;
            case 16871:
                ((fpe) obj).j(i).i = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw new era(a.bC(j, "ContentCompAlgo ", " not supported"), (java.lang.Throwable) null, true, 1);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw new era(a.bC(j, "DocTypeReadVersion ", " not supported"), (java.lang.Throwable) null, true, 1);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw new era(a.bC(j, "EBMLReadVersion ", " not supported"), (java.lang.Throwable) null, true, 1);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw new era(a.bC(j, "ContentEncAlgo ", " not supported"), (java.lang.Throwable) null, true, 1);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw new era(a.bC(j, "AESSettingsCipherMode ", " not supported"), (java.lang.Throwable) null, true, 1);
                }
                return;
            case 21420:
                fpe fpeVar7 = (fpe) obj;
                fpeVar7.m = j + fpeVar7.e;
                return;
            case 21432:
                int i3 = (int) j;
                fpe fpeVar8 = (fpe) obj;
                fpeVar8.l(i);
                if (i3 == 0) {
                    fpeVar8.j.z = 0;
                    return;
                }
                if (i3 == 1) {
                    fpeVar8.j.z = 2;
                    return;
                } else if (i3 == 3) {
                    fpeVar8.j.z = 1;
                    return;
                } else {
                    if (i3 == 15) {
                        fpeVar8.j.z = 3;
                        return;
                    }
                    return;
                }
            case 21680:
                ((fpe) obj).j(i).r = (int) j;
                return;
            case 21682:
                ((fpe) obj).j(i).t = (int) j;
                return;
            case 21690:
                ((fpe) obj).j(i).s = (int) j;
                return;
            case 21930:
                ((fpe) obj).j(i).aa = j == 1;
                return;
            case 21938:
                fpe fpeVar9 = (fpe) obj;
                fpeVar9.l(i);
                fpeVar9.j.q = (int) j;
                return;
            case 21998:
                ((fpe) obj).j(i).h = (int) j;
                return;
            case 22186:
                ((fpe) obj).j(i).U = j;
                return;
            case 22203:
                ((fpe) obj).j(i).V = j;
                return;
            case 25188:
                ((fpe) obj).j(i).R = (int) j;
                return;
            case 30114:
                ((fpe) obj).z = j;
                return;
            case 30321:
                int i4 = (int) j;
                fpe fpeVar10 = (fpe) obj;
                fpeVar10.l(i);
                if (i4 == 0) {
                    fpeVar10.j.u = 0;
                    return;
                }
                if (i4 == 1) {
                    fpeVar10.j.u = 1;
                    return;
                } else if (i4 == 2) {
                    fpeVar10.j.u = 2;
                    return;
                } else {
                    if (i4 == 3) {
                        fpeVar10.j.u = 3;
                        return;
                    }
                    return;
                }
            case 2352003:
                ((fpe) obj).j(i).g = (int) j;
                return;
            case 2807729:
                ((fpe) obj).f = j;
                return;
            default:
                int i5 = (int) j;
                switch (i) {
                    case 21945:
                        fpe fpeVar11 = (fpe) obj;
                        fpeVar11.l(i);
                        if (i5 == 1) {
                            fpeVar11.j.C = 2;
                            return;
                        } else {
                            if (i5 == 2) {
                                fpeVar11.j.C = 1;
                                return;
                            }
                            return;
                        }
                    case 21946:
                        fpe fpeVar12 = (fpe) obj;
                        fpeVar12.l(i);
                        int iB = epy.b(i5);
                        if (iB != -1) {
                            fpeVar12.j.B = iB;
                            return;
                        }
                        return;
                    case 21947:
                        fpe fpeVar13 = (fpe) obj;
                        fpeVar13.l(i);
                        int iA = epy.a(i5);
                        if (iA != -1) {
                            fpeVar13.j.A = iA;
                            return;
                        }
                        return;
                    case 21948:
                        ((fpe) obj).j(i).D = i5;
                        return;
                    case 21949:
                        ((fpe) obj).j(i).E = i5;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: era */
    public final void t(int i, long j, long j2) throws era {
        fpe fpeVar = (fpe) this.a;
        fpeVar.m();
        if (i == 128) {
            fpeVar.i(i).h = null;
            fpeVar.i(i).i = null;
            return;
        }
        if (i == 160) {
            fpeVar.y = false;
            fpeVar.z = 0L;
            return;
        }
        if (i == 174) {
            fpeVar.j = new fpd();
            fpeVar.j.a = fpeVar.h;
            return;
        }
        if (i == 187) {
            if (fpeVar.k) {
                return;
            }
            fpeVar.k(i);
            fpeVar.o = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            fpeVar.l = -1;
            fpeVar.m = -1L;
            return;
        }
        if (i == 20533) {
            fpeVar.j(i).j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = fpeVar.e;
            if (j3 != -1 && j3 != j) {
                throw new era("Multiple Segment elements not supported", (java.lang.Throwable) null, true, 1);
            }
            fpeVar.e = j;
            fpeVar.d = j2;
            return;
        }
        if (i == 475249515) {
            if (fpeVar.k) {
                return;
            }
            fpeVar.n = true;
            return;
        }
        if (i == 524531317) {
            if (fpeVar.s == -1 || fpeVar.u) {
                fpeVar.o();
                return;
            } else {
                fpeVar.t = true;
                return;
            }
        }
        if (i == 182) {
            fpeVar.i.push(new fpa());
            return;
        }
        if (i != 183 || fpeVar.k) {
            return;
        }
        fpeVar.k(i);
        fpeVar.p = -1;
        fpeVar.q = -1L;
        fpeVar.r = -1L;
    }

    public final void u(java.lang.Exception exc) {
        etr.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        ils ilsVar = ((fca) this.a).q;
        java.lang.Object obj = ilsVar.b;
        if (obj != null) {
            ((android.os.Handler) obj).post(new drn(ilsVar, 19));
        }
    }

    public final void v() {
        eyj eyjVar = (eyj) this.a;
        if (eyjVar.f()) {
            eyjVar.f.f(2);
        }
    }

    public final void w(eyh eyhVar) {
        java.lang.Object obj = this.a;
        ((eyc) obj).f.d(new esz(obj, eyhVar, 7));
    }

    public final defpackage.aprf x(defpackage.zfj zfjVar) {
        return new defpackage.aprf(zfjVar, (defpackage.rai) ((hil) this.a).a.yJ.a());
    }

    public rai(hio hioVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public rai(hio hioVar, byte[] bArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public rai(hio hioVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public rai(hio hioVar, byte[] bArr, char[] cArr) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public rai(hio hioVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public rai(hio hioVar, char[] cArr) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public rai(hio hioVar, char[] cArr, byte[] bArr) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public rai(hio hioVar, short[] sArr) {
        j$.util.Objects.requireNonNull(hioVar);
        this.a = hioVar;
    }

    public /* synthetic */ rai(java.lang.Object obj) {
        this.a = obj;
    }

    public rai(java.lang.Object obj, byte[] bArr) {
        this.a = obj;
    }

    public rai(eyj eyjVar) {
        j$.util.Objects.requireNonNull(eyjVar);
        this.a = eyjVar;
    }

    public rai(hhz hhzVar) {
        j$.util.Objects.requireNonNull(hhzVar);
        this.a = hhzVar;
    }

    public rai(hir hirVar, short[] sArr, byte[] bArr) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fbn fbnVar) {
        j$.util.Objects.requireNonNull(fbnVar);
        this.a = fbnVar;
    }

    public rai(hih hihVar, byte[] bArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }

    public rai(hir hirVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fbp fbpVar) {
        j$.util.Objects.requireNonNull(fbpVar);
        this.a = fbpVar;
    }

    public rai(hih hihVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }

    public rai(hir hirVar, char[] cArr, byte[] bArr) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fbw fbwVar) {
        j$.util.Objects.requireNonNull(fbwVar);
        this.a = fbwVar;
    }

    public rai(hih hihVar) {
        j$.util.Objects.requireNonNull(hihVar);
        this.a = hihVar;
    }

    public rai(hir hirVar, byte[] bArr, char[] cArr) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fca fcaVar) {
        j$.util.Objects.requireNonNull(fcaVar);
        this.a = fcaVar;
    }

    public rai(hil hilVar, boolean[] zArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hir hirVar, short[] sArr) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fcq fcqVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(fcqVar);
        this.a = fcqVar;
    }

    public rai(hil hilVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hir hirVar, byte[] bArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fcq fcqVar) {
        j$.util.Objects.requireNonNull(fcqVar);
        this.a = fcqVar;
    }

    public rai(hil hilVar, char[] cArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hir hirVar, char[] cArr) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fei feiVar) {
        j$.util.Objects.requireNonNull(feiVar);
        this.a = feiVar;
    }

    public rai(hil hilVar, byte[] bArr, char[] cArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hir hirVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(fpe fpeVar) {
        j$.util.Objects.requireNonNull(fpeVar);
        this.a = fpeVar;
    }

    public rai(hil hilVar, short[] sArr, byte[] bArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hir hirVar) {
        j$.util.Objects.requireNonNull(hirVar);
        this.a = hirVar;
    }

    public rai(hil hilVar, byte[] bArr, byte[] bArr2, char[] cArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hjc hjcVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(hjcVar);
        this.a = hjcVar;
    }

    public rai(hil hilVar, char[] cArr, char[] cArr2) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hjc hjcVar) {
        j$.util.Objects.requireNonNull(hjcVar);
        this.a = hjcVar;
    }

    public rai(hil hilVar, byte[] bArr, short[] sArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hjy hjyVar) {
        j$.util.Objects.requireNonNull(hjyVar);
        this.a = hjyVar;
    }

    public rai(hil hilVar, int[] iArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hjq hjqVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(hjqVar);
        this.a = hjqVar;
    }

    public rai(hil hilVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hjq hjqVar) {
        j$.util.Objects.requireNonNull(hjqVar);
        this.a = hjqVar;
    }

    public rai(hil hilVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(hjr hjrVar) {
        j$.util.Objects.requireNonNull(hjrVar);
        this.a = hjrVar;
    }

    public rai(hil hilVar, byte[] bArr, char[] cArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(kxx kxxVar) {
        j$.util.Objects.requireNonNull(kxxVar);
        this.a = kxxVar;
    }

    public rai(hil hilVar, short[] sArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(lmk lmkVar) {
        j$.util.Objects.requireNonNull(lmkVar);
        this.a = lmkVar;
    }

    public rai(hil hilVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(lzv lzvVar) {
        j$.util.Objects.requireNonNull(lzvVar);
        this.a = lzvVar;
    }

    public rai(hil hilVar, char[] cArr, byte[] bArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(mlp mlpVar, char[] cArr) {
        j$.util.Objects.requireNonNull(mlpVar);
        this.a = mlpVar;
    }

    public rai(hil hilVar, byte[] bArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(defpackage.qgn qgnVar, byte[] bArr, byte[] bArr2) {
        j$.util.Objects.requireNonNull(qgnVar);
        this.a = qgnVar;
    }

    public rai(hil hilVar, char[] cArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(defpackage.qgn qgnVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(qgnVar);
        this.a = qgnVar;
    }

    public rai(hil hilVar, byte[] bArr) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }

    public rai(defpackage.qgn qgnVar) {
        j$.util.Objects.requireNonNull(qgnVar);
        this.a = qgnVar;
    }

    public rai(hil hilVar) {
        j$.util.Objects.requireNonNull(hilVar);
        this.a = hilVar;
    }
}
