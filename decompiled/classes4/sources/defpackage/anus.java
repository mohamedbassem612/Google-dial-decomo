package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class anus implements defpackage.aodk {
    public static final java.util.logging.Logger v = java.util.logging.Logger.getLogger(defpackage.anus.class.getName());

    @Override // defpackage.aodk
    public final void d() {
        defpackage.aoad aoadVarV;
        defpackage.aodu aoduVar;
        if (v().i || (aoduVar = (aoadVarV = v()).b) == null || aoduVar.a() <= 0) {
            return;
        }
        aoadVarV.a(false, true);
    }

    @Override // defpackage.aodk
    public final void f() {
        defpackage.anur anurVarQ = q();
        defpackage.anzz anzzVar = anurVarQ.m;
        anzzVar.a = anurVarQ;
        anurVarQ.j = anzzVar;
    }

    @Override // defpackage.aodk
    public final void g(int i) {
        defpackage.anur anurVarQ = q();
        defpackage.anwf anwfVar = anurVarQ.j;
        int i2 = defpackage.aoik.a;
        anurVarQ.e(new defpackage.akbd(anurVarQ, i, 4));
    }

    @Override // defpackage.aodk
    public final void h(anmj anmjVar) {
        v().d = anmjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aodk
    public final void n(java.io.InputStream inputStream) {
        int iA;
        try {
            if (!v().i) {
                defpackage.aoad aoadVarV = v();
                if (aoadVarV.i) {
                    throw new java.lang.IllegalStateException("Framer already closed");
                }
                aoadVarV.j++;
                aoadVarV.k++;
                aoadVarV.l = 0L;
                defpackage.aodj.g(aoadVarV.h);
                anmi anmiVar = aoadVarV.d;
                anmi anmiVar2 = anmh.a;
                try {
                    try {
                        try {
                            int iAvailable = inputStream.available();
                            if (iAvailable != 0 && anmiVar != anmiVar2) {
                                defpackage.aoaa aoaaVar = new defpackage.aoaa(aoadVarV);
                                try {
                                    iA = inputStream.a(aoaaVar);
                                    aoaaVar.close();
                                    int i = aoadVarV.a;
                                    if (i >= 0 && iA > i) {
                                        throw new defpackage.anqz(anqw.h.f(java.lang.String.format(java.util.Locale.US, "message too large %d > %d", java.lang.Integer.valueOf(iA), java.lang.Integer.valueOf(aoadVarV.a))), null);
                                    }
                                    aoadVarV.b(aoaaVar, true);
                                } catch (java.lang.Throwable th) {
                                    aoaaVar.close();
                                    throw th;
                                }
                            } else if (iAvailable != -1) {
                                aoadVarV.l = iAvailable;
                                int i2 = aoadVarV.a;
                                if (i2 >= 0 && iAvailable > i2) {
                                    throw new defpackage.anqz(anqw.h.f(java.lang.String.format(java.util.Locale.US, "message too large %d > %d", java.lang.Integer.valueOf(iAvailable), java.lang.Integer.valueOf(aoadVarV.a))), null);
                                }
                                java.nio.ByteBuffer byteBuffer = aoadVarV.f;
                                byteBuffer.clear();
                                byteBuffer.put((byte) 0).putInt(iAvailable);
                                aoadVarV.c = iAvailable + 5;
                                aoadVarV.c(byteBuffer.array(), 0, byteBuffer.position());
                                iA = inputStream.a(aoadVarV.e);
                            } else {
                                defpackage.aoaa aoaaVar2 = new defpackage.aoaa(aoadVarV);
                                iA = inputStream.a(aoaaVar2);
                                aoadVarV.b(aoaaVar2, false);
                            }
                            if (iAvailable != -1 && iA != iAvailable) {
                                throw new defpackage.anqz(anqw.k.f(java.lang.String.format("Message length inaccurate %s != %s", java.lang.Integer.valueOf(iA), java.lang.Integer.valueOf(iAvailable))), null);
                            }
                            defpackage.aodj aodjVar = aoadVarV.h;
                            defpackage.aodj.g(aodjVar);
                            aodjVar.c(aoadVarV.l);
                            defpackage.aodj.g(aodjVar);
                        } catch (java.io.IOException e) {
                            throw new defpackage.anqz(anqw.k.f("Failed to frame message").e(e), null);
                        }
                    } catch (java.lang.RuntimeException e2) {
                        throw new defpackage.anqz(anqw.k.f("Failed to frame message").e(e2), null);
                    }
                } catch (defpackage.anqz e3) {
                    throw e3;
                }
            }
            anxo.h(inputStream);
        } catch (java.lang.Throwable th2) {
            anxo.h(inputStream);
            throw th2;
        }
    }

    @Override // defpackage.aodk
    public boolean o() {
        throw null;
    }

    protected abstract defpackage.anur q();

    protected abstract defpackage.aoad v();

    public final void w(int i) {
        defpackage.anur anurVarQ = q();
        synchronized (anurVarQ.k) {
            anurVarQ.n += i;
        }
    }
}
