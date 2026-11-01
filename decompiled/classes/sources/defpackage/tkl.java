package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tkl {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public tkl(defpackage.khw khwVar, defpackage.aolr aolrVar) {
        if (khwVar == null) {
            defpackage.aooh.i("dao");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.d = khwVar;
        this.c = aolrVar;
        this.a = new defpackage.apdp();
        this.b = defpackage.aazc.p("PeopleDirectoryContactEntity", "uuid", khwVar, new defpackage.aoom() { // from class: khv
            @Override // defpackage.aoom
            public final java.lang.Object b(java.lang.Object obj) {
                return ((defpackage.kid) obj).a;
            }
        }, new defpackage.aeza());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kel] */
    public final defpackage.tkj a(defpackage.kiu kiuVar) {
        defpackage.aooh.f(kiuVar, "coalescedRow");
        return (defpackage.tkj) hgt.w(kiuVar, (defpackage.kel) this.d);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [aoss, java.lang.Object] */
    public final defpackage.swa b(defpackage.svs svsVar, java.lang.String str) {
        return new defpackage.swa(svsVar, null, str, (defpackage.zpz) this.d, (defpackage.apni) this.b, (defpackage.aazc) this.a, this.c);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [aoss, java.lang.Object] */
    public final defpackage.swa c(defpackage.swa swaVar, java.lang.String str) {
        defpackage.aooh.f(swaVar, "cache");
        return new defpackage.swa(swaVar.b, swaVar, str, (defpackage.zpz) this.d, (defpackage.apni) this.b, (defpackage.aazc) this.a, this.c);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.mev(this, (defpackage.aoln) null, 17), aolnVar);
    }

    public final j$.util.Optional e() {
        return (j$.util.Optional) ((java.util.concurrent.atomic.AtomicReference) this.d).get();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void f(boolean z) {
        j$.util.Optional optionalOf = j$.util.Optional.of(java.lang.Boolean.valueOf(z));
        if (((j$.util.Optional) ((java.util.concurrent.atomic.AtomicReference) this.d).getAndSet(optionalOf)).equals(optionalOf)) {
            return;
        }
        j$.lang.Iterable.-EL.forEach(((defpackage.zzx) this.c).e().g(), new lkh(z, 2));
        ((defpackage.zpz) this.a).a(defpackage.ahvr.F(new onq(3), this.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aoin, java.lang.Object] */
    public final defpackage.oqa g(defpackage.az azVar) {
        defpackage.zzx zzxVar = (defpackage.zzx) this.d.a();
        zzxVar.getClass();
        defpackage.ipc ipcVar = (defpackage.ipc) this.a.a();
        ipcVar.getClass();
        azVar.getClass();
        return new defpackage.oqa(zzxVar, ipcVar, this.b, this.c, azVar);
    }

    public final boolean h() {
        boolean zIsWakeLockLevelSupported = ((android.os.PowerManager) this.c).isWakeLockLevelSupported(32);
        defpackage.zjv.i((defpackage.zjv) this.b, defpackage.mgv.POWER_MANAGER_IS_WAKE_LOCK_LEVEL_SUPPORTED, defpackage.ajsz.aY(defpackage.gus.au(32)), defpackage.gus.ax(zIsWakeLockLevelSupported), 0, 24);
        return zIsWakeLockLevelSupported;
    }

    public final android.os.PowerManager.WakeLock i(java.lang.String str) {
        android.os.PowerManager.WakeLock wakeLockNewWakeLock = ((android.os.PowerManager) this.c).newWakeLock(32, str);
        defpackage.zjv.i((defpackage.zjv) this.b, defpackage.mgv.POWER_MANAGER_NEW_WAKE_LOCK, defpackage.ajsz.bb(defpackage.gus.au(32), defpackage.gus.aw(str)), null, 0, 28);
        defpackage.aooh.e(wakeLockNewWakeLock, "also(...)");
        return wakeLockNewWakeLock;
    }

    public final int j(int i) {
        int state = ((android.hardware.display.DisplayManager) this.a).getDisplay(i).getState();
        java.lang.Object obj = this.b;
        j$.util.Objects.requireNonNull(obj);
        java.lang.Object objD = defpackage.gus.aD(defpackage.mgv.DISPLAY_MANAGER_GET_DISPLAY_STATE, state, (defpackage.mgu) obj).d(new exw(i, 2));
        defpackage.aooh.e(objD, "asUserdata(...)");
        return ((java.lang.Number) objD).intValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object k(android.hardware.display.DisplayManager.DisplayListener displayListener, android.os.Handler handler, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.d, new defpackage.hcn(this, displayListener, handler, (defpackage.aoln) null, 8), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object l(android.hardware.display.DisplayManager.DisplayListener displayListener, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.d, new ofa(this, displayListener, (defpackage.aoln) null, 4), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    public final void m(android.hardware.display.DisplayManager.DisplayListener displayListener, android.os.Handler handler) {
        defpackage.aooh.f(displayListener, "listener");
        ((android.hardware.display.DisplayManager) this.a).registerDisplayListener(displayListener, handler);
    }

    public final void n(android.hardware.display.DisplayManager.DisplayListener displayListener) {
        defpackage.aooh.f(displayListener, "listener");
        ((android.hardware.display.DisplayManager) this.a).unregisterDisplayListener(displayListener);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object o(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.ohg(this, (defpackage.aoln) null, 4, (char[]) null), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.ajcq p() {
        return defpackage.ahvr.I(((defpackage.lht) this.a).b(), new kxm(this, 14), this.c);
    }

    public final defpackage.isq q(defpackage.kiu kiuVar) {
        j$.util.Optional optionalG = ((defpackage.zjm) this.a).g();
        kdb kdbVar = new kdb(kiuVar, 6);
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((defpackage.aogc) optionalG.get()).bc((defpackage.kiu) kdbVar.a));
        }
        return (defpackage.isq) optionalG.orElse((java.lang.Object) null);
    }

    public final defpackage.tkj r(defpackage.kiu kiuVar) {
        j$.util.Optional optionalG = ((defpackage.zjm) this.d).g();
        kdb kdbVar = new kdb(kiuVar, 7);
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((defpackage.tkl) optionalG.get()).a((defpackage.kiu) kdbVar.a));
        }
        return (defpackage.tkj) optionalG.orElse((java.lang.Object) null);
    }

    public final boolean s(defpackage.kiu kiuVar) {
        defpackage.tkj tkjVarR = r(kiuVar);
        if (tkjVarR != null) {
            tki tkiVarB = tki.b(tkjVarR.g);
            if (tkiVarB == null) {
                tkiVarB = tki.d;
            }
            if (tkiVarB == tki.a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0062  */
    /* JADX WARN: Code duplicated, block: B:43:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x006f  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public final boolean t(defpackage.kiu kiuVar) {
        defpackage.isq isqVarQ;
        kiw kiwVar;
        int iAQ;
        kiw kiwVar2;
        int iAQ2;
        int iAW;
        kiw kiwVar3 = kiuVar.r;
        if (kiwVar3 == null) {
            kiwVar3 = kiw.a;
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar3.o);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        if (rmtVarB == defpackage.rmt.SOURCE_TYPE_DIRECTORY) {
            return false;
        }
        defpackage.tkj tkjVarR = r(kiuVar);
        if (tkjVarR == null) {
            isqVarQ = q(kiuVar);
            if (isqVarQ != null) {
                iAW = defpackage.a.aW(isqVarQ.h);
                if (iAW != 0 || iAW != 5) {
                }
            } else {
                kiwVar = kiuVar.r;
                if (kiwVar == null) {
                    kiwVar = kiw.a;
                }
                iAQ = defpackage.a.aQ(kiwVar.m);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                kiwVar2 = kiuVar.r;
                if (kiwVar2 == null) {
                    kiwVar2 = kiw.a;
                }
                iAQ2 = defpackage.a.aQ(kiwVar2.n);
                if (iAQ2 == 0) {
                    iAQ2 = 1;
                }
                if (iAQ == 1) {
                    iAQ = iAQ2;
                }
                if (iAQ != 2) {
                    return false;
                }
            }
        } else {
            tki tkiVarB = tki.b(tkjVarR.g);
            if (tkiVarB == null) {
                tkiVarB = tki.d;
            }
            if (tkiVarB == tki.a) {
                tki tkiVarB2 = tki.b(tkjVarR.f);
                if (tkiVarB2 == null) {
                    tkiVarB2 = tki.d;
                }
                if (tkiVarB2 != tki.b) {
                    isqVarQ = q(kiuVar);
                    if (isqVarQ != null) {
                        iAW = defpackage.a.aW(isqVarQ.h);
                        return iAW != 0 ? false : false;
                    }
                    kiwVar = kiuVar.r;
                    if (kiwVar == null) {
                        kiwVar = kiw.a;
                    }
                    iAQ = defpackage.a.aQ(kiwVar.m);
                    if (iAQ == 0) {
                        iAQ = 1;
                    }
                    kiwVar2 = kiuVar.r;
                    if (kiwVar2 == null) {
                        kiwVar2 = kiw.a;
                    }
                    iAQ2 = defpackage.a.aQ(kiwVar2.n);
                    if (iAQ2 == 0) {
                        iAQ2 = 1;
                    }
                    if (iAQ == 1) {
                        iAQ = iAQ2;
                    }
                    if (iAQ != 2) {
                        return false;
                    }
                }
            } else if (tkiVarB != tki.b) {
                return false;
            }
        }
        return true;
    }

    public final boolean u(defpackage.kiu kiuVar) {
        int iAW;
        int iAR;
        int iAW2;
        int iAR2;
        defpackage.mmy mmyVarO = ((defpackage.rsr) this.b).O(kiuVar);
        if ((mmyVarO.b & 256) != 0 && (iAR2 = defpackage.a.aR(mmyVarO.k)) != 0 && iAR2 == 3) {
            return true;
        }
        defpackage.isq isqVarQ = q(kiuVar);
        if (isqVarQ != null && (iAW2 = defpackage.a.aW(isqVarQ.h)) != 0 && iAW2 == 4) {
            return true;
        }
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        defpackage.udj udjVarB = defpackage.udj.b(kiwVar.l);
        if (udjVarB == null) {
            udjVarB = defpackage.udj.SPAM_STATUS_UNKNOWN;
        }
        if (udjVarB == defpackage.udj.SPAM_STATUS_SPAM) {
            return true;
        }
        kiw kiwVar2 = kiuVar.r;
        defpackage.udj udjVarB2 = defpackage.udj.b((kiwVar2 == null ? kiw.a : kiwVar2).l);
        if (udjVarB2 == null) {
            udjVarB2 = defpackage.udj.SPAM_STATUS_UNKNOWN;
        }
        if (udjVarB2 != defpackage.udj.SPAM_STATUS_NOT_SPAM) {
            if (kiwVar2 == null) {
                kiwVar2 = kiw.a;
            }
            if (kiwVar2.k) {
                return true;
            }
            if (((mmyVarO.b & 256) == 0 || (iAR = defpackage.a.aR(mmyVarO.k)) == 0 || iAR != 4) && (isqVarQ == null || (iAW = defpackage.a.aW(isqVarQ.h)) == 0 || iAW != 3)) {
                ucu ucuVar = kiuVar.w;
                if (ucuVar == null) {
                    ucuVar = ucu.a;
                }
                return defpackage.wsc.bU(ucuVar);
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [aoin, java.lang.Object] */
    public final boolean v(defpackage.kiu kiuVar) {
        if (kiuVar.q != 2 || ((java.lang.Boolean) this.c.a()).booleanValue()) {
            kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar.o);
            if (rmtVarB == null) {
                rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
            }
            if (rmtVarB != defpackage.rmt.SOURCE_TYPE_DIRECTORY) {
                return u(kiuVar);
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object w(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.c, new hnj(this, (defpackage.aoln) null, 7), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:55:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v8, types: [aoin, java.lang.Object] */
    public final java.lang.Object x(kho khoVar, defpackage.aoln aolnVar) {
        khp khpVar;
        java.lang.String str;
        jhw jhwVarG;
        defpackage.akzx akzxVar;
        java.lang.String string;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        khq khqVar;
        java.lang.String str5;
        java.lang.String str6;
        if (aolnVar instanceof khp) {
            khpVar = (khp) aolnVar;
            int i = khpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                khpVar.b = i - Integer.MIN_VALUE;
            } else {
                khpVar = new khp(this, aolnVar);
            }
        } else {
            khpVar = new khp(this, aolnVar);
        }
        java.lang.Object objA = khpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = khpVar.b;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            java.lang.String str7 = khoVar.i;
            if (str7 != null) {
                java.lang.Object obj = this.b;
                khpVar.c = khoVar;
                khpVar.b = 1;
                objA = ((defpackage.khc) obj).a(str7, khpVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                str = null;
            }
            jhwVarG = hgt.G(defpackage.kgu.a.m());
            akzxVar = (defpackage.akzx) jhwVarG.a;
            akzxVar.u();
            defpackage.kgu kguVar = (defpackage.kgu) akzxVar.b;
            java.lang.String str8 = khoVar.b;
            j$.util.Objects.requireNonNull(str8);
            kguVar.c = str8;
            string = khoVar.d;
            if (string != null) {
                akzxVar.u();
                defpackage.kgu kguVar2 = (defpackage.kgu) akzxVar.b;
                j$.util.Objects.requireNonNull(string);
                kguVar2.b |= 1;
                kguVar2.d = string;
                if (string.length() != 0 || !((defpackage.alfc) this.a.a()).b.contains(khoVar.e)) {
                    str2 = khoVar.c;
                    if (str2 != null) {
                        string = defpackage.pez.aq((android.content.Context) this.d, str2).toString();
                    } else {
                        string = null;
                    }
                }
            } else {
                str2 = khoVar.c;
                if (str2 != null) {
                    string = defpackage.pez.aq((android.content.Context) this.d, str2).toString();
                } else {
                    string = null;
                }
            }
            if (string != null) {
                jhwVarG.y(string);
            }
            if (str != null) {
                akzxVar.u();
                defpackage.kgu kguVar3 = (defpackage.kgu) akzxVar.b;
                j$.util.Objects.requireNonNull(str);
                kguVar3.b |= 2;
                kguVar3.e = str;
            }
            str3 = khoVar.f;
            if (str3 != null) {
                if (true != android.util.Patterns.EMAIL_ADDRESS.matcher(str3).matches()) {
                    str3 = null;
                }
                if (str3 != null) {
                    akzxVar.u();
                    defpackage.kgu kguVar4 = (defpackage.kgu) akzxVar.b;
                    j$.util.Objects.requireNonNull(str3);
                    kguVar4.b |= 4;
                    kguVar4.f = str3;
                }
            }
            str4 = khoVar.i;
            if (str4 != null) {
                akzxVar.u();
                defpackage.kgu kguVar5 = (defpackage.kgu) akzxVar.b;
                j$.util.Objects.requireNonNull(str4);
                kguVar5.b |= 8;
                kguVar5.g = str4;
            }
            if (!((defpackage.khr) this.c).b() && (str6 = khoVar.g) != null) {
                akzxVar.u();
                defpackage.kgu kguVar6 = (defpackage.kgu) akzxVar.b;
                j$.util.Objects.requireNonNull(str6);
                kguVar6.b |= 32;
                kguVar6.i = str6;
            }
            khqVar = khoVar.h;
            if (khqVar != null) {
                java.lang.String str9 = khqVar.a;
                str5 = str9.length() > 0 ? str9 : null;
                if (str5 != null) {
                    jhwVarG.y(str5);
                }
                jhwVarG.A(khqVar.b);
                jhwVarG.z(khqVar.c);
                jhwVarG.x(khqVar.d);
            }
            return jhwVarG.w();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        khoVar = khpVar.c;
        defpackage.aooc.af(objA);
        str = (java.lang.String) objA;
        jhwVarG = hgt.G(defpackage.kgu.a.m());
        akzxVar = (defpackage.akzx) jhwVarG.a;
        akzxVar.u();
        defpackage.kgu kguVar7 = (defpackage.kgu) akzxVar.b;
        java.lang.String str10 = khoVar.b;
        j$.util.Objects.requireNonNull(str10);
        kguVar7.c = str10;
        string = khoVar.d;
        if (string != null) {
            akzxVar.u();
            defpackage.kgu kguVar8 = (defpackage.kgu) akzxVar.b;
            j$.util.Objects.requireNonNull(string);
            kguVar8.b |= 1;
            kguVar8.d = string;
            if (string.length() != 0) {
                str2 = khoVar.c;
                if (str2 != null) {
                    string = defpackage.pez.aq((android.content.Context) this.d, str2).toString();
                } else {
                    string = null;
                }
            } else {
                str2 = khoVar.c;
                if (str2 != null) {
                    string = defpackage.pez.aq((android.content.Context) this.d, str2).toString();
                } else {
                    string = null;
                }
            }
        } else {
            str2 = khoVar.c;
            if (str2 != null) {
                string = defpackage.pez.aq((android.content.Context) this.d, str2).toString();
            } else {
                string = null;
            }
        }
        if (string != null) {
            jhwVarG.y(string);
        }
        if (str != null) {
            akzxVar.u();
            defpackage.kgu kguVar9 = (defpackage.kgu) akzxVar.b;
            j$.util.Objects.requireNonNull(str);
            kguVar9.b |= 2;
            kguVar9.e = str;
        }
        str3 = khoVar.f;
        if (str3 != null) {
            if (true != android.util.Patterns.EMAIL_ADDRESS.matcher(str3).matches()) {
                str3 = null;
            }
            if (str3 != null) {
                akzxVar.u();
                defpackage.kgu kguVar10 = (defpackage.kgu) akzxVar.b;
                j$.util.Objects.requireNonNull(str3);
                kguVar10.b |= 4;
                kguVar10.f = str3;
            }
        }
        str4 = khoVar.i;
        if (str4 != null) {
            akzxVar.u();
            defpackage.kgu kguVar11 = (defpackage.kgu) akzxVar.b;
            j$.util.Objects.requireNonNull(str4);
            kguVar11.b |= 8;
            kguVar11.g = str4;
        }
        if (!((defpackage.khr) this.c).b()) {
            akzxVar.u();
            defpackage.kgu kguVar12 = (defpackage.kgu) akzxVar.b;
            j$.util.Objects.requireNonNull(str6);
            kguVar12.b |= 32;
            kguVar12.i = str6;
        }
        khqVar = khoVar.h;
        if (khqVar != null) {
            java.lang.String str11 = khqVar.a;
            if (str11.length() > 0) {
            }
            if (str5 != null) {
                jhwVarG.y(str5);
            }
            jhwVarG.A(khqVar.b);
            jhwVarG.z(khqVar.c);
            jhwVarG.x(khqVar.d);
        }
        return jhwVarG.w();
    }

    public tkl(defpackage.rsr rsrVar, defpackage.aogc aogcVar, defpackage.aolr aolrVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(aoinVar, "enableCancelMissedCallNotificationByCreationTime");
        this.d = rsrVar;
        this.b = aogcVar;
        this.a = aolrVar;
        this.c = aoinVar;
    }

    public tkl(defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.rsr rsrVar, defpackage.aoin aoinVar) {
        this.d = zjmVar;
        this.a = zjmVar2;
        this.b = rsrVar;
        this.c = aoinVar;
    }

    public tkl(android.content.Context context, defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.mgu mguVar, android.hardware.display.DisplayManager displayManager) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        this.c = context;
        this.d = aolrVar;
        this.b = mguVar;
        this.a = displayManager;
    }

    public tkl(android.content.Context context, defpackage.khr khrVar, defpackage.khc khcVar, defpackage.aoin aoinVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (khcVar == null) {
            defpackage.aooh.i("haloAppDisplayName");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("haloCachedNameAllowlist");
        }
        this.d = context;
        this.c = khrVar;
        this.b = khcVar;
        this.a = aoinVar;
    }

    public tkl(defpackage.aoss aossVar, defpackage.aolr aolrVar, defpackage.zjv zjvVar, defpackage.mgu mguVar, android.os.PowerManager powerManager) {
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (zjvVar == null) {
            defpackage.aooh.i("externalsLogging");
        }
        if (mguVar == null) {
            defpackage.aooh.i("scopedDiffRecorder");
        }
        this.d = aolrVar;
        this.b = zjvVar;
        this.a = mguVar;
        this.c = powerManager;
    }

    public tkl(defpackage.lht lhtVar, defpackage.ajct ajctVar, defpackage.lcb lcbVar, defpackage.llz llzVar) {
        this.a = lhtVar;
        this.c = ajctVar;
        this.b = lcbVar;
        this.d = llzVar;
    }

    public tkl(defpackage.ajct ajctVar, defpackage.opx opxVar, defpackage.kjr kjrVar) {
        if (ajctVar == null) {
            defpackage.aooh.i("backgroundExecutor");
        }
        if (opxVar == null) {
            defpackage.aooh.i("dialerGlobalContentObservers");
        }
        if (kjrVar == null) {
            defpackage.aooh.i("annotatedCallLogRefreshStarter");
        }
        this.c = ajctVar;
        this.b = opxVar;
        this.d = kjrVar;
        this.a = new defpackage.ajdc(ajctVar);
    }

    public tkl(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.d = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
        aoinVar3.getClass();
        this.b = aoinVar3;
        aoinVar4.getClass();
        this.c = aoinVar4;
    }

    public tkl(defpackage.zpz zpzVar, defpackage.zzx zzxVar, defpackage.ajct ajctVar) {
        this.d = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());
        this.a = zpzVar;
        this.c = zzxVar;
        this.b = ajctVar;
    }

    public tkl(defpackage.abvh abvhVar, defpackage.abvp abvpVar, defpackage.aoin aoinVar, defpackage.aolr aolrVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableCallingCardRepositoryV2");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.c = abvhVar;
        this.a = abvpVar;
        this.b = aoinVar;
        this.d = aolrVar;
    }

    public tkl(defpackage.zpz zpzVar, defpackage.apni apniVar, defpackage.aazc aazcVar, defpackage.aoss aossVar) {
        if (zpzVar == null) {
            defpackage.aooh.i("inCallUpdatePropagator");
        }
        if (apniVar == null) {
            defpackage.aooh.i("androidJobs");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.d = zpzVar;
        this.b = apniVar;
        this.a = aazcVar;
        this.c = aossVar;
    }

    public tkl(defpackage.rsr rsrVar, defpackage.gat gatVar, defpackage.moe moeVar, defpackage.aogc aogcVar) {
        if (moeVar == null) {
            defpackage.aooh.i("sharpieCallLogDataIntegration");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("sharpieSettings");
        }
        this.a = rsrVar;
        this.b = gatVar;
        this.d = moeVar;
        this.c = aogcVar;
    }
}
