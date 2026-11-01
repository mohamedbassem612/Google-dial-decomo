package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class albl implements albw {
    private final albh a;
    private final alci b;
    private final boolean c;

    public albl(alci alciVar, albh albhVar) {
        this.b = alciVar;
        this.c = albhVar instanceof alaa;
        this.a = albhVar;
    }

    public final int a(java.lang.Object obj) {
        int i;
        int iAu;
        int iG;
        alcj alcjVarB = alci.b(obj);
        int iNumberOfLeadingZeros = alcjVarB.e;
        if (iNumberOfLeadingZeros == -1) {
            iNumberOfLeadingZeros = 0;
            for (int i2 = 0; i2 < alcjVarB.b; i2++) {
                int i3 = alcjVarB.c[i2] >>> 3;
                akzc akzcVar = (akzc) alcjVarB.d[i2];
                int iAu2 = a.au(2, i3);
                int iC = akzcVar.c();
                iNumberOfLeadingZeros += iAu2 + 2 + ((352 - (java.lang.Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC + 1;
            }
            alcjVarB.e = iNumberOfLeadingZeros;
        }
        if (!this.c) {
            return iNumberOfLeadingZeros;
        }
        alcb alcbVar = ajsz.T(obj).b;
        int size = alcbVar.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            alby albyVarA = alcbVar.a(i5);
            alac alacVar = albyVarA.c;
            java.lang.Object obj2 = albyVarA.a;
            if (alacVar.a() == alcs.i) {
                if (obj2 instanceof alax) {
                    iAu = a.au(2, alacVar.a);
                    iG = ((alax) obj2).a();
                } else {
                    iAu = a.au(2, alacVar.a);
                    iG = akzk.G((albh) obj2);
                }
                i = iAu + 2 + iG + 1;
            } else {
                i = akzs.i(alacVar, obj2);
            }
            i4 += i;
        }
        return iNumberOfLeadingZeros + i4;
    }

    public final int b(java.lang.Object obj) {
        int iHashCode = alci.b(obj).hashCode();
        return this.c ? (iHashCode * 53) + ajsz.T(obj).hashCode() : iHashCode;
    }

    public final java.lang.Object e() {
        alad aladVar = this.a;
        return aladVar instanceof alad ? aladVar.s() : aladVar.K().s();
    }

    public final void g(java.lang.Object obj) {
        alci.e(obj);
        ajsz.W(obj);
    }

    public final void h(java.lang.Object obj, java.lang.Object obj2) {
        alci alciVar = albx.a;
        ((alad) obj).P = alci.c(alci.b(obj), alci.b(obj2));
        if (this.c) {
            albx.i(obj, obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [albh, java.lang.Object] */
    public final void i(java.lang.Object obj, akzg akzgVar, akzq akzqVar) {
        boolean zO;
        alci alciVar = this.b;
        alcj alcjVarD = alci.d(obj);
        akzs akzsVarU = ajsz.U(obj);
        do {
            try {
                if (akzgVar.c() == Integer.MAX_VALUE) {
                    break;
                }
                int i = akzgVar.b;
                zO = true;
                if (i == 11) {
                    apdi apdiVarB = null;
                    akzc akzcVarO = null;
                    int i2 = 0;
                    for (int i3 = Integer.MAX_VALUE; akzgVar.c() != i3; i3 = Integer.MAX_VALUE) {
                        int i4 = akzgVar.b;
                        if (i4 != 16) {
                            if (i4 != 26) {
                                if (i4 == 12 || !akzgVar.O()) {
                                    break;
                                }
                            } else if (apdiVarB != null) {
                                ajsz.V(akzgVar, apdiVarB, akzqVar, akzsVarU);
                            } else {
                                akzcVarO = akzgVar.o();
                            }
                        } else {
                            i2 = akzgVar.i();
                            apdiVarB = akzqVar.b(this.a, i2);
                        }
                    }
                    if (akzgVar.b != 12) {
                        throw new alaz("Protocol message end-group tag did not match expected tag.");
                    }
                    if (akzcVarO != null) {
                        if (apdiVarB != null) {
                            akzf akzfVar = akzgVar.a;
                            int i5 = ((akzfVar.f - akzfVar.d) - akzfVar.e) - 1;
                            if (i5 < 0) {
                                throw new alaz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                            }
                            akzf akzfVarG = akzcVarO.g();
                            akzfVarG.f = i5;
                            albg albgVarK = apdiVarB.c.K();
                            albgVarK.k(akzfVarG, akzqVar);
                            akzsVarU.k((alac) apdiVarB.a, albgVarK.s());
                            akzfVarG.A(0);
                        } else {
                            alcjVarD.e((i2 << 3) | 2, akzcVarO);
                        }
                    }
                } else if ((i & 7) == 2) {
                    apdi apdiVarB2 = akzqVar.b(this.a, i >>> 3);
                    if (apdiVarB2 != null) {
                        ajsz.V(akzgVar, apdiVarB2, akzqVar, akzsVarU);
                    } else {
                        zO = alciVar.a(alcjVarD, akzgVar, 0);
                    }
                } else {
                    zO = akzgVar.O();
                }
            } catch (java.lang.Throwable th) {
                alci.f(obj, alcjVarD);
                throw th;
            }
        } while (zO);
        alci.f(obj, alcjVarD);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: alaz */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[EDGE_INSN: B:52:0x00bd->B:32:0x00bd BREAK  A[LOOP:1: B:18:0x006b->B:55:0x006b], SYNTHETIC] */
    public final void j(java.lang.Object obj, byte[] bArr, int i, int i2, akyq akyqVar) throws alaz {
        alad aladVar = (alad) obj;
        alcj alcjVar = aladVar.P;
        if (alcjVar == alcj.a) {
            alcjVar = new alcj();
            aladVar.P = alcjVar;
        }
        alcj alcjVar2 = alcjVar;
        akzs akzsVarB = ((alaa) obj).b();
        int iS = i;
        apdi apdiVar = null;
        while (iS < i2) {
            apdi apdiVarB = apdiVar;
            int iM = akyr.m(bArr, iS, akyqVar);
            int i3 = akyqVar.a;
            if (i3 == 11) {
                int i4 = 0;
                akzc akzcVar = null;
                while (iM < i2) {
                    iM = akyr.m(bArr, iM, akyqVar);
                    int i5 = akyqVar.a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 == 2) {
                        if (i7 != 0) {
                            if (i5 != 12) {
                                break;
                                break;
                            }
                            iM = akyr.s(i5, bArr, iM, i2, akyqVar);
                        } else {
                            iM = akyr.m(bArr, iM, akyqVar);
                            i4 = akyqVar.a;
                            apdiVarB = akyqVar.d.b(this.a, i4);
                        }
                    } else {
                        if (i6 == 3) {
                            if (apdiVarB != null) {
                                iM = akyr.g(albp.a.b(apdiVarB.c.getClass()), bArr, iM, i2, akyqVar);
                                akzsVarB.k((alac) apdiVarB.a, akyqVar.c);
                            } else if (i7 == 2) {
                                iM = akyr.c(bArr, iM, akyqVar);
                                akzcVar = (akzc) akyqVar.c;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            iM = akyr.s(i5, bArr, iM, i2, akyqVar);
                        }
                    }
                }
                if (akzcVar != null) {
                    alcjVar2.e((i4 << 3) | 2, akzcVar);
                }
                iS = iM;
            } else if ((i3 & 7) == 2) {
                apdiVarB = akyqVar.d.b(this.a, i3 >>> 3);
                if (apdiVarB != null) {
                    iS = akyr.g(albp.a.b(apdiVarB.c.getClass()), bArr, iM, i2, akyqVar);
                    akzsVarB.k((alac) apdiVarB.a, akyqVar.c);
                } else {
                    iS = akyr.l(i3, bArr, iM, i2, alcjVar2, akyqVar);
                }
            } else {
                iS = akyr.s(i3, bArr, iM, i2, akyqVar);
            }
            apdiVar = apdiVarB;
        }
        if (iS != i2) {
            throw new alaz("Failed to parse the message.");
        }
    }

    public final boolean k(java.lang.Object obj, java.lang.Object obj2) {
        if (!alci.b(obj).equals(alci.b(obj2))) {
            return false;
        }
        if (this.c) {
            return ajsz.T(obj).equals(ajsz.T(obj2));
        }
        return true;
    }

    public final boolean l(java.lang.Object obj) {
        return ajsz.T(obj).h();
    }

    public final void m(java.lang.Object obj, ajyk ajykVar) {
        akzc akzcVar;
        java.util.Iterator itD = ajsz.T(obj).d();
        while (itD.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itD.next();
            alac alacVar = (alac) entry.getKey();
            if (alacVar.a() != alcs.i) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof defpackage.alav) {
                int i = alacVar.a;
                alax alaxVar = (alax) ((defpackage.alav) entry).a.getValue();
                if (alaxVar.a != null) {
                    akzcVar = alaxVar.a;
                } else {
                    synchronized (alaxVar) {
                        if (alaxVar.a != null) {
                            akzcVar = alaxVar.a;
                        } else {
                            alaxVar.a = alaxVar.b.f();
                            akzcVar = alaxVar.a;
                        }
                    }
                }
                ajykVar.A(i, akzcVar);
            } else {
                ajykVar.A(alacVar.a, entry.getValue());
            }
        }
        alcj alcjVarB = alci.b(obj);
        for (int i2 = 0; i2 < alcjVarB.b; i2++) {
            ajykVar.A(alcjVarB.c[i2] >>> 3, alcjVarB.d[i2]);
        }
    }
}
