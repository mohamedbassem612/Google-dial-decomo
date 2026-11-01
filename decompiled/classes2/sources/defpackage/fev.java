package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fev extends defpackage.ewz implements android.os.Handler.Callback {
    private final defpackage.feu k;
    private final android.os.Handler l;
    private final defpackage.fnp m;
    private defpackage.fno n;
    private boolean o;
    private boolean p;
    private long q;
    private defpackage.eqy r;
    private long s;
    private final defpackage.exy t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fev(defpackage.exy exyVar, android.os.Looper looper) {
        android.os.Handler handler;
        super(5);
        defpackage.feu feuVar = defpackage.feu.a;
        ahvr.ci(exyVar);
        this.t = exyVar;
        if (looper == null) {
            handler = null;
        } else {
            java.lang.String str = eum.a;
            handler = new android.os.Handler(looper, this);
        }
        this.l = handler;
        this.k = feuVar;
        this.m = new defpackage.fnp();
        this.s = -9223372036854775807L;
    }

    private final long Z(long j) {
        ahvr.bY(j != -9223372036854775807L);
        ahvr.bY(this.s != -9223372036854775807L);
        return j - this.s;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    private final void aa(defpackage.eqy eqyVar, java.util.List list) {
        for (int i = 0; i < eqyVar.a(); i++) {
            defpackage.eqg eqgVarA = eqyVar.b(i).a();
            if (eqgVarA != null) {
                defpackage.feu feuVar = this.k;
                if (feuVar.b(eqgVarA)) {
                    defpackage.fno fnoVarA = feuVar.a(eqgVarA);
                    byte[] bArrC = eqyVar.b(i).c();
                    ahvr.ci(bArrC);
                    defpackage.fnp fnpVar = this.m;
                    fnpVar.dJ();
                    fnpVar.d(bArrC.length);
                    java.nio.ByteBuffer byteBuffer = fnpVar.d;
                    java.lang.String str = eum.a;
                    byteBuffer.put(bArrC);
                    fnpVar.e();
                    defpackage.eqy eqyVarA = fnoVarA.a(fnpVar);
                    if (eqyVarA != null) {
                        aa(eqyVarA, list);
                    }
                } else {
                    list.add(eqyVar.b(i));
                }
            } else {
                list.add(eqyVar.b(i));
            }
        }
    }

    private final void ab(defpackage.eqy eqyVar) {
        defpackage.exy exyVar = this.t;
        defpackage.eyc eycVar = exyVar.a;
        defpackage.eqv eqvVar = new defpackage.eqv(eycVar.v);
        for (int i = 0; i < eqyVar.a(); i++) {
            eqyVar.b(i).b(eqvVar);
        }
        eycVar.v = new defpackage.eqw(eqvVar);
        defpackage.eqw eqwVarE = eycVar.E();
        if (!eqwVarE.equals(eycVar.q)) {
            eycVar.q = eqwVarE;
            eycVar.h.c(14, new defpackage.exq(exyVar, 13));
        }
        defpackage.eto etoVar = eycVar.h;
        etoVar.c(28, new defpackage.exq(eqyVar, 14));
        etoVar.b();
    }

    @Override // defpackage.ezf, defpackage.ezg
    public final java.lang.String U() {
        return "MetadataRenderer";
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    @Override // defpackage.ezf
    public final void V(long j, long j2) {
        boolean z;
        int iS;
        defpackage.eqy eqyVarA;
        java.util.List arrayList;
        long j3;
        do {
            z = false;
            if (!this.o && this.r == null) {
                defpackage.fnp fnpVar = this.m;
                fnpVar.dJ();
                defpackage.hiz hizVarT = T();
                int iS2 = S(hizVarT, fnpVar, 5);
                while (iS2 == -5) {
                    java.lang.Object obj = hizVarT.a;
                    ahvr.ci(obj);
                    this.q = ((defpackage.eqg) obj).u;
                    iS2 = S(hizVarT, fnpVar, 5);
                }
                if (iS2 == -3) {
                    if (fnpVar.dL(4)) {
                        j3 = this.i;
                        long j4 = j - this.d;
                        if (j3 != -9223372036854775807L && j4 >= j3 - 1000000) {
                            iS = S(hizVarT, fnpVar, 0);
                            if (iS == -4) {
                                if (fnpVar.dL(4)) {
                                    this.o = true;
                                } else if (fnpVar.f >= this.e) {
                                    fnpVar.h = this.q;
                                    fnpVar.e();
                                    defpackage.fno fnoVar = this.n;
                                    java.lang.String str = eum.a;
                                    eqyVarA = fnoVar.a(fnpVar);
                                    if (eqyVarA != null) {
                                        arrayList = new java.util.ArrayList(eqyVarA.a());
                                        aa(eqyVarA, arrayList);
                                        if (!arrayList.isEmpty()) {
                                            this.r = new defpackage.eqy(Z(fnpVar.f), (defpackage.eqx[]) arrayList.toArray(new defpackage.eqx[0]));
                                        }
                                    }
                                }
                            } else if (iS == -5) {
                                java.lang.Object obj2 = hizVarT.a;
                                ahvr.ci(obj2);
                                this.q = ((defpackage.eqg) obj2).u;
                            }
                        }
                    }
                } else if (fnpVar.dL(4)) {
                    j3 = this.i;
                    long j5 = j - this.d;
                    if (j3 != -9223372036854775807L) {
                        iS = S(hizVarT, fnpVar, 0);
                        if (iS == -4) {
                            if (fnpVar.dL(4)) {
                                this.o = true;
                            } else if (fnpVar.f >= this.e) {
                                fnpVar.h = this.q;
                                fnpVar.e();
                                defpackage.fno fnoVar2 = this.n;
                                java.lang.String str2 = eum.a;
                                eqyVarA = fnoVar2.a(fnpVar);
                                if (eqyVarA != null) {
                                    arrayList = new java.util.ArrayList(eqyVarA.a());
                                    aa(eqyVarA, arrayList);
                                    if (!arrayList.isEmpty()) {
                                        this.r = new defpackage.eqy(Z(fnpVar.f), (defpackage.eqx[]) arrayList.toArray(new defpackage.eqx[0]));
                                    }
                                }
                            }
                        } else if (iS == -5) {
                            java.lang.Object obj3 = hizVarT.a;
                            ahvr.ci(obj3);
                            this.q = ((defpackage.eqg) obj3).u;
                        }
                    }
                } else if (j >= fnpVar.f - 1000000) {
                    iS = S(hizVarT, fnpVar, 0);
                    if (iS == -4) {
                        if (fnpVar.dL(4)) {
                            this.o = true;
                        } else if (fnpVar.f >= this.e) {
                            fnpVar.h = this.q;
                            fnpVar.e();
                            defpackage.fno fnoVar3 = this.n;
                            java.lang.String str3 = eum.a;
                            eqyVarA = fnoVar3.a(fnpVar);
                            if (eqyVarA != null) {
                                arrayList = new java.util.ArrayList(eqyVarA.a());
                                aa(eqyVarA, arrayList);
                                if (!arrayList.isEmpty()) {
                                    this.r = new defpackage.eqy(Z(fnpVar.f), (defpackage.eqx[]) arrayList.toArray(new defpackage.eqx[0]));
                                }
                            }
                        }
                    } else if (iS == -5) {
                        java.lang.Object obj4 = hizVarT.a;
                        ahvr.ci(obj4);
                        this.q = ((defpackage.eqg) obj4).u;
                    }
                }
            }
            defpackage.eqy eqyVar = this.r;
            if (eqyVar != null) {
                if (eqyVar.b <= Z(j)) {
                    defpackage.eqy eqyVar2 = this.r;
                    android.os.Handler handler = this.l;
                    if (handler != null) {
                        handler.obtainMessage(1, eqyVar2).sendToTarget();
                    } else {
                        ab(eqyVar2);
                    }
                    this.r = null;
                    z = true;
                }
            }
            if (this.o && this.r == null) {
                this.p = true;
            }
        } while (z);
    }

    @Override // defpackage.ezf
    public final boolean W() {
        return this.p;
    }

    @Override // defpackage.ezf
    public final boolean X() {
        return true;
    }

    @Override // defpackage.ezg
    public final int Y(defpackage.eqg eqgVar) {
        if (this.k.b(eqgVar)) {
            return 128 | (eqgVar.Q == 0 ? 4 : 2);
        }
        return 128;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            throw new java.lang.IllegalStateException();
        }
        ab((defpackage.eqy) message.obj);
        return true;
    }

    @Override // defpackage.ewz
    protected final void s() {
        this.r = null;
        this.n = null;
        this.s = -9223372036854775807L;
    }

    @Override // defpackage.ewz
    protected final void u(long j, boolean z, boolean z2) {
        this.r = null;
        this.o = false;
        this.p = false;
    }

    @Override // defpackage.ewz
    protected final void z(defpackage.eqg[] eqgVarArr, long j, long j2, defpackage.ffu ffuVar) {
        this.n = this.k.a(eqgVarArr[0]);
        defpackage.eqy eqyVar = this.r;
        if (eqyVar != null) {
            long j3 = this.s;
            long j4 = eqyVar.b;
            long j5 = (j3 + j4) - j2;
            if (j4 != j5) {
                eqyVar = new defpackage.eqy(j5, eqyVar.a);
            }
            this.r = eqyVar;
        }
        this.s = j2;
    }
}
