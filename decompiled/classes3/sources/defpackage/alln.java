package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alln {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public alln(aglw... aglwVarArr) throws aois {
        defpackage.agky agkyVar;
        this.d = new java.util.ArrayList(3);
        this.f = new java.util.ArrayList(3);
        this.b = new java.util.ArrayList(3);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(new cpp(0L), cdu.c);
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        final int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            aglw aglwVar = aglwVarArr[i2];
            defpackage.aglv aglvVar = aglwVar.a;
            final aomy aomyVar = aglwVar.b;
            j$.util.Objects.checkIndex(0, 14);
            if (aglvVar instanceof defpackage.agla) {
                agkyVar = new defpackage.agky(new aglo(aomyVar, this), 3);
            } else {
                final int i3 = 2;
                byte[] bArr = null;
                if (aglvVar instanceof defpackage.agkz) {
                    agkyVar = new defpackage.agky(new defpackage.xtu(aomyVar, this, 20, bArr), 2);
                } else {
                    final int i4 = 1;
                    if (aglvVar instanceof defpackage.agle) {
                        agkyVar = new defpackage.agky(new defpackage.agld() { // from class: aglp
                            /* JADX WARN: Type inference failed for: r3v6, types: [aomy, java.lang.Object] */
                            @Override // defpackage.agld
                            public final float a() {
                                int i5 = i4;
                                if (i5 == 0) {
                                    return ((ceg) ((defpackage.alln) aomyVar).a).c();
                                }
                                ?? r3 = aomyVar;
                                if (i5 == 1) {
                                    aoov.f((java.lang.Object) r3, 0);
                                    return ((java.lang.Number) r3.a()).floatValue();
                                }
                                aoov.f((java.lang.Object) r3, 0);
                                throw null;
                            }
                        }, 3);
                    } else if (aglvVar instanceof defpackage.aglg) {
                        agkyVar = new defpackage.agky(new defpackage.aprf(aomyVar), 5);
                    } else if (aglvVar instanceof defpackage.agkw) {
                        agkyVar = new defpackage.agky(new defpackage.addr(aomyVar, 17), 1);
                    } else if (aglvVar instanceof defpackage.agkx) {
                        agkyVar = new defpackage.agky(new defpackage.aglr(aomyVar), 0);
                    } else if (aglvVar instanceof defpackage.agli) {
                        agkyVar = new defpackage.agky(new defpackage.aprf(aomyVar, (byte[]) null), 7);
                    } else if (aglvVar instanceof defpackage.aglh) {
                        agkyVar = new defpackage.agky(new defpackage.aprf(aomyVar, (byte[]) null), 6);
                    } else if (aglvVar instanceof defpackage.aglc) {
                        aoov.f(aomyVar, 0);
                        agkyVar = new defpackage.agky(aomyVar, 2);
                    } else if (aglvVar instanceof defpackage.aglf) {
                        aoov.f(aomyVar, 0);
                        agkyVar = new defpackage.agky(aomyVar, 4);
                    } else if (aglvVar instanceof defpackage.agll) {
                        aoov.f(aomyVar, 0);
                        agkyVar = new defpackage.agky(aomyVar, 9);
                    } else if (aglvVar instanceof defpackage.aglu) {
                        agkyVar = aglwVar instanceof agkv ? new defpackage.agky(new defpackage.agld() { // from class: aglp
                            /* JADX WARN: Type inference failed for: r3v6, types: [aomy, java.lang.Object] */
                            @Override // defpackage.agld
                            public final float a() {
                                int i5 = i;
                                if (i5 == 0) {
                                    return ((ceg) ((defpackage.alln) this).a).c();
                                }
                                ?? r3 = this;
                                if (i5 == 1) {
                                    aoov.f((java.lang.Object) r3, 0);
                                    return ((java.lang.Number) r3.a()).floatValue();
                                }
                                aoov.f((java.lang.Object) r3, 0);
                                throw null;
                            }
                        }, 3) : new defpackage.agky(new defpackage.agld() { // from class: aglp
                            /* JADX WARN: Type inference failed for: r3v6, types: [aomy, java.lang.Object] */
                            @Override // defpackage.agld
                            public final float a() {
                                int i5 = i3;
                                if (i5 == 0) {
                                    return ((ceg) ((defpackage.alln) aomyVar).a).c();
                                }
                                ?? r3 = aomyVar;
                                if (i5 == 1) {
                                    aoov.f((java.lang.Object) r3, 0);
                                    return ((java.lang.Number) r3.a()).floatValue();
                                }
                                aoov.f((java.lang.Object) r3, 0);
                                throw null;
                            }
                        }, 3);
                    } else {
                        if (!(aglvVar instanceof defpackage.aglk)) {
                            throw new aois();
                        }
                        agkyVar = aglwVar instanceof agku ? new defpackage.agky(new defpackage.aglq(this, 1), 8) : new defpackage.agky(new defpackage.aglq(aomyVar, 0), 8);
                    }
                }
            }
            ((java.util.ArrayList) this.d).add(aglvVar);
            ((java.util.ArrayList) this.f).add(aglvVar.a());
            ((java.util.ArrayList) this.b).add(agkyVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aljs */
    public static defpackage.alln g(defpackage.alqd alqdVar, java.lang.String str, alkf alkfVar) throws aljs {
        try {
            amha amhaVar = amha.a;
            amha amhaVarA = alqdVar.a(alad.M(amha.class), str);
            return new defpackage.alln(alqdVar, aitt.g(amhaVarA.e).b(new alki(15)).f(), (aify) j$.util.Collection.-EL.stream(amhaVarA.e).map(new alki(15)).collect(aido.a), amhaVarA.f, alkfVar);
        } catch (java.io.IOException e) {
            throw new aljs("Failed to load robot intent specs", aljr.b, e);
        }
    }

    private static java.lang.String j(java.lang.String str) {
        if (str != null) {
            return ahvr.cn(str.trim());
        }
        return null;
    }

    public final int a(java.lang.String str) {
        amgz amgzVarD = d(str);
        return (amgzVarD.b & 128) != 0 ? amgzVarD.i : java.lang.Math.max(b(str).size(), 2);
    }

    public final aify b(java.lang.String str) {
        return aify.n(d(str).g);
    }

    public final alsy c(java.lang.String str) {
        alsy alsyVarB = alsy.b(d(str).n);
        return alsyVarB == null ? alsy.a : alsyVarB;
    }

    public final amgz d(java.lang.String str) {
        return (amgz) j$.util.Optional.ofNullable((amgz) ((aigf) this.a).get(str)).orElseThrow(new acul(str, 2));
    }

    public final java.lang.String e(java.lang.String str) {
        amgz amgzVarD = d(str);
        return !amgzVarD.m.isEmpty() ? amgzVarD.m : amgzVarD.l;
    }

    public final boolean f(java.lang.String str) {
        java.lang.Object obj = this.f;
        defpackage.alqd alqdVar = (defpackage.alqd) obj;
        if (alqdVar.d()) {
            if (!j$.nio.file.Files.exists(j$.nio.file.Path.-CC.of((java.lang.String) alqdVar.b.get(), new java.lang.String[]{str}), new j$.nio.file.LinkOption[0])) {
                return false;
            }
        } else {
            try {
                java.io.InputStream inputStreamOpen = ((defpackage.alqd) obj).a.getAssets().open(str);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (java.io.IOException unused) {
                return false;
            }
        }
        return true;
    }

    public final float h() {
        return ((ceg) this.c).c();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Type inference failed for: r0v0, types: [aehm, java.lang.Object] */
    public final void i(java.lang.Object obj, aeiq aeiqVar) {
        boolean z;
        java.lang.String str;
        ?? r0 = this.b;
        java.lang.String strJ = j(r0.e(obj));
        java.lang.String strJ2 = j(r0.c(obj));
        aeis aeisVar = (aeis) this.d;
        aehj aehjVar = aeisVar.b;
        java.lang.String strC = r0.c(obj);
        boolean zG = r0.g(obj);
        aooh.f(strC, "accountName");
        if (zG) {
            aimo aimoVar = new aimo(strC);
            if (!aimoVar.c || (((str = aimoVar.a) == null || !aoov.ad(str, "/seed/")) && !aoov.s(aimoVar.b, "glimitedaccount.com", false))) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (true == new aehp(!z).a) {
            strJ2 = null;
        }
        if (strJ == null) {
            strJ = strJ2;
        }
        if (true == a.L(strJ, strJ2)) {
            strJ2 = null;
        }
        ahvr.ci(strJ);
        java.lang.String strReplace = strJ.replace('-', (char) 8209);
        android.widget.TextView textView = (android.widget.TextView) this.e;
        textView.setText(strReplace);
        if (strJ2 != null) {
            java.lang.String strReplace2 = strJ2.replace('-', (char) 8209);
            java.lang.Object obj2 = this.a;
            int i = dzs.a;
            ((android.view.View) obj2).setImportantForAccessibility(2);
            strReplace = a.bE(strReplace2, (byte) 10, strReplace);
            android.widget.TextView textView2 = (android.widget.TextView) obj2;
            textView2.setText(strReplace2);
            textView2.setVisibility(0);
        } else {
            ((android.widget.TextView) this.a).setVisibility(8);
        }
        java.lang.Object obj3 = this.f;
        if (obj3 != null) {
            ((android.widget.TextView) this.a).getVisibility();
            ahyn ahynVar = aeisVar.a;
            ((android.widget.TextView) obj3).setVisibility(8);
        }
        java.lang.String strA = aeiqVar.a(strReplace);
        java.lang.Object obj4 = this.c;
        aesg.i(new defpackage.aawj(obj4, obj, 16));
        com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc = (com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc) obj4;
        java.lang.String str2 = accountParticleDisc.l.f() ? ((defpackage.aeih) accountParticleDisc.l.b()).b : null;
        if (str2 != null) {
            strA = a.bE(str2, (byte) 10, strA);
        }
        textView.setContentDescription(strA);
    }

    public alln(aeir aeirVar, defpackage.aehm aehmVar, aeis aeisVar) {
        this.c = aeirVar.h();
        this.e = aeirVar.f();
        this.a = aeirVar.g();
        this.f = aeirVar.e();
        ahvr.ci(aehmVar);
        this.b = aehmVar;
        this.d = aeisVar;
    }

    public alln(defpackage.aeit aeitVar, defpackage.aelf aelfVar, defpackage.alfm alfmVar, defpackage.aelt aeltVar, defpackage.aeix aeixVar) {
        this.f = aeitVar;
        this.a = aelfVar;
        akzx akzxVarP = alfmVar.p();
        akzxVarP.u();
        defpackage.alfm alfmVar2 = (defpackage.alfm) akzxVarP.b;
        alfmVar2.c = 3;
        alfmVar2.b |= 1;
        this.d = (defpackage.alfm) akzxVarP.p();
        akzx akzxVarP2 = alfmVar.p();
        akzxVarP2.u();
        defpackage.alfm alfmVar3 = (defpackage.alfm) akzxVarP2.b;
        alfmVar3.c = 4;
        alfmVar3.b |= 1;
        this.c = (defpackage.alfm) akzxVarP2.p();
        this.b = aeltVar;
        this.e = aeixVar;
    }

    public alln(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6) {
        this.a = aoinVar;
        this.b = aoinVar2;
        this.d = aoinVar3;
        this.e = aoinVar4;
        this.c = aoinVar5;
        this.f = aoinVar6;
    }

    private alln(defpackage.alqd alqdVar, aigf aigfVar, aify aifyVar, java.lang.String str, alkf alkfVar) {
        this.f = alqdVar;
        this.a = aigfVar;
        this.c = aifyVar;
        this.b = str;
        this.e = alkfVar;
        this.d = new java.util.HashMap();
        new j$.util.concurrent.ConcurrentHashMap();
    }
}
