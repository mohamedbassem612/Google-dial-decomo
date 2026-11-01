package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class anxr extends defpackage.anur {
    private static final annt a;
    private static final anpc b;
    private anqw c;
    private anph d;
    private java.nio.charset.Charset e;
    private boolean f;

    static {
        defpackage.anxq anxqVar = new defpackage.anxq();
        a = anxqVar;
        b = annu.a(":status", anxqVar);
    }

    protected anxr(int i, defpackage.aodj aodjVar, aodq aodqVar) {
        super(i, aodjVar, aodqVar);
        this.e = java.nio.charset.StandardCharsets.UTF_8;
    }

    private static java.nio.charset.Charset f(anph anphVar) {
        java.lang.String str = (java.lang.String) anphVar.c(anxo.h);
        if (str != null) {
            java.lang.String[] strArrSplit = str.split("charset=", 2);
            try {
                return java.nio.charset.Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (java.lang.Exception unused) {
            }
        }
        return java.nio.charset.StandardCharsets.UTF_8;
    }

    private static void q(anph anphVar) {
        anphVar.f(b);
        anphVar.f(defpackage.annw.b);
        anphVar.f(defpackage.annw.a);
    }

    private static final anqw r(anph anphVar) {
        char cCharAt;
        java.lang.Integer num = (java.lang.Integer) anphVar.c(b);
        if (num == null) {
            return anqw.k.f("Missing HTTP status code");
        }
        java.lang.String str = (java.lang.String) anphVar.c(anxo.h);
        if (str != null && str.length() >= 16) {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        anqw anqwVarA = anxo.a(num.intValue());
        return str == null ? anqwVarA.b("missing content-type in response headers") : anqwVarA.b("invalid content-type: ".concat(str));
    }

    protected abstract void c(anqw anqwVar, boolean z, anph anphVar);

    protected final void n(defpackage.aoaw aoawVar, boolean z) {
        anqw anqwVar = this.c;
        boolean z2 = false;
        if (anqwVar != null) {
            java.nio.charset.Charset charset = this.e;
            defpackage.aoaw aoawVar2 = defpackage.aoba.a;
            ahvr.cj(charset, "charset");
            int iF = aoawVar.f();
            byte[] bArr = new byte[iF];
            aoawVar.j(bArr, 0, iF);
            this.c = anqwVar.b("DATA-----------------------------\n".concat(new java.lang.String(bArr, charset)));
            aoawVar.close();
            if (this.c.p.length() > 1000 || z) {
                c(this.c, false, this.d);
                return;
            }
            return;
        }
        if (!this.f) {
            aoawVar.close();
            c(anqw.k.f("headers not received before payload"), false, new anph());
            return;
        }
        int iF2 = aoawVar.f();
        boolean z3 = true;
        try {
            if (this.t) {
                defpackage.anup.s.logp(java.util.logging.Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                aoawVar.close();
            } else {
                try {
                    defpackage.anwf anwfVar = this.j;
                    try {
                        if (((defpackage.anzz) anwfVar).b() || ((defpackage.anzz) anwfVar).f) {
                            aoawVar.close();
                        } else {
                            ((defpackage.anzz) anwfVar).d.h(aoawVar);
                            try {
                                ((defpackage.anzz) anwfVar).a();
                            } catch (java.lang.Throwable th) {
                                th = th;
                                z3 = false;
                                if (z3) {
                                    aoawVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        b(th3);
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        if (z2) {
                            aoawVar.close();
                        }
                        throw th;
                    }
                }
            }
            if (z) {
                if (iF2 > 0) {
                    this.c = anqw.k.f("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.c = anqw.k.f("Received unexpected EOS on empty DATA frame from server");
                }
                anph anphVar = new anph();
                this.d = anphVar;
                l(this.c, false, anphVar);
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            z2 = true;
        }
    }

    public final void o(anph anphVar) {
        anqw anqwVarB;
        anqw anqwVar = this.c;
        if (anqwVar != null) {
            this.c = anqwVar.b("headers: ".concat(anphVar.toString()));
            return;
        }
        try {
            if (!this.f) {
                java.lang.Integer num = (java.lang.Integer) anphVar.c(b);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.f = true;
                    anqw anqwVarR = r(anphVar);
                    this.c = anqwVarR;
                    if (anqwVarR != null) {
                        anqwVarB = anqwVarR.b("headers: ".concat(anphVar.toString()));
                    } else {
                        q(anphVar);
                        ahvr.bZ(!this.t, "Received headers on closed stream");
                        this.p.d();
                        java.lang.String str = (java.lang.String) anphVar.c(anxo.c);
                        if (str == null) {
                            this.q.c(anphVar);
                        } else {
                            anmi anmiVarA = this.r.a(str);
                            if (anmiVarA == null) {
                                b(new defpackage.anqz(anqw.k.f(java.lang.String.format("Can't find decompressor for %s", str)), null));
                            } else {
                                if (anmiVarA != anmh.a) {
                                    ((defpackage.anzz) this.j).c = anmiVarA;
                                }
                                this.q.c(anphVar);
                            }
                        }
                    }
                }
                this.c = anqwVarB;
                this.d = anphVar;
                this.e = f(anphVar);
            }
            this.c = anqw.k.f("Received headers twice");
            anqw anqwVar2 = this.c;
            if (anqwVar2 != null) {
                anqwVarB = anqwVar2.b("headers: ".concat(anphVar.toString()));
                this.c = anqwVarB;
                this.d = anphVar;
                this.e = f(anphVar);
            }
        } catch (java.lang.Throwable th) {
            anqw anqwVar3 = this.c;
            if (anqwVar3 != null) {
                this.c = anqwVar3.b("headers: ".concat(anphVar.toString()));
                this.d = anphVar;
                this.e = f(anphVar);
            }
            throw th;
        }
    }

    public final void p(anph anphVar) {
        anqw anqwVarB;
        anqw anqwVarR = this.c;
        if (anqwVarR == null && !this.f) {
            anqwVarR = r(anphVar);
            this.c = anqwVarR;
            if (anqwVarR != null) {
                this.d = anphVar;
            }
        }
        if (anqwVarR != null) {
            anqw anqwVarB2 = anqwVarR.b("trailers: ".concat(anphVar.toString()));
            this.c = anqwVarB2;
            c(anqwVarB2, false, this.d);
            return;
        }
        anqw anqwVar = (anqw) anphVar.c(defpackage.annw.b);
        if (anqwVar != null) {
            anqwVarB = anqwVar.f((java.lang.String) anphVar.c(defpackage.annw.a));
        } else if (this.f) {
            anqwVarB = anqw.d.f("missing GRPC status in response");
        } else {
            java.lang.Integer num = (java.lang.Integer) anphVar.c(b);
            anqwVarB = (num != null ? anxo.a(num.intValue()) : anqw.k.f("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
        }
        q(anphVar);
        if (this.t) {
            defpackage.anup.s.logp(java.util.logging.Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new java.lang.Object[]{anqwVarB, anphVar});
        } else {
            this.p.e();
            l(anqwVarB, false, anphVar);
        }
    }
}
