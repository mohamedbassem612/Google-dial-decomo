package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajvj {
    public static final defpackage.ajvb a;
    public static final defpackage.ajvb b;
    private static final java.nio.charset.Charset d = java.nio.charset.Charset.forName("UTF-8");
    private static final defpackage.ajvc e;
    public final java.util.Map c;
    private java.io.OutputStream f;
    private final java.util.Map g;
    private final defpackage.ajvc h;
    private final defpackage.agmc i = new defpackage.agmc();

    static {
        amac amacVar = new amac("key");
        amacVar.g(new defpackage.ajve(1, defpackage.ajvh.a));
        a = amacVar.f();
        amac amacVar2 = new amac("value");
        amacVar2.g(new defpackage.ajve(2, defpackage.ajvh.a));
        b = amacVar2.f();
        e = new defpackage.ajvk(1);
    }

    public ajvj(java.io.OutputStream outputStream, java.util.Map map, java.util.Map map2, defpackage.ajvc ajvcVar) {
        this.f = outputStream;
        this.c = map;
        this.g = map2;
        this.h = ajvcVar;
    }

    private static int d(defpackage.ajvb ajvbVar) {
        defpackage.ajvi ajviVar = (defpackage.ajvi) ajvbVar.a(defpackage.ajvi.class);
        if (ajviVar != null) {
            return ajviVar.a();
        }
        throw new defpackage.ajva("Field has no @Protobuf config");
    }

    private static defpackage.ajvi e(defpackage.ajvb ajvbVar) {
        defpackage.ajvi ajviVar = (defpackage.ajvi) ajvbVar.a(defpackage.ajvi.class);
        if (ajviVar != null) {
            return ajviVar;
        }
        throw new defpackage.ajva("Field has no @Protobuf config");
    }

    private static java.nio.ByteBuffer f(int i) {
        return java.nio.ByteBuffer.allocate(i).order(java.nio.ByteOrder.LITTLE_ENDIAN);
    }

    private final void g(int i) throws java.io.IOException {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            java.io.OutputStream outputStream = this.f;
            if (j == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    private final void h(long j) throws java.io.IOException {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            java.io.OutputStream outputStream = this.f;
            if (j2 == 0) {
                outputStream.write(i);
                return;
            } else {
                outputStream.write(i | 128);
                j >>>= 7;
            }
        }
    }

    private final void i(defpackage.ajvc ajvcVar, defpackage.ajvb ajvbVar, java.lang.Object obj, boolean z) throws java.io.IOException {
        defpackage.ajvf ajvfVar = new defpackage.ajvf();
        try {
            java.io.OutputStream outputStream = this.f;
            this.f = ajvfVar;
            try {
                ajvcVar.a(obj, this);
                this.f = outputStream;
                long j = ajvfVar.a;
                ajvfVar.close();
                if (z && j == 0) {
                    return;
                }
                g((d(ajvbVar) << 3) | 2);
                h(j);
                ajvcVar.a(obj, this);
            } catch (java.lang.Throwable th) {
                this.f = outputStream;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                ajvfVar.close();
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void a(defpackage.ajvb ajvbVar, int i, boolean z) throws java.io.IOException {
        if (z && i == 0) {
            return;
        }
        defpackage.ajvi ajviVarE = e(ajvbVar);
        int iOrdinal = ajviVarE.b().ordinal();
        if (iOrdinal == 0) {
            g(ajviVarE.a() << 3);
            g(i);
        } else if (iOrdinal == 1) {
            g(ajviVarE.a() << 3);
            g((i << 1) ^ (i >> 31));
        } else if (iOrdinal == 2) {
            g((ajviVarE.a() << 3) | 5);
            this.f.write(f(4).putInt(i).array());
        }
    }

    public final void b(defpackage.ajvb ajvbVar, long j, boolean z) throws java.io.IOException {
        if (z && j == 0) {
            return;
        }
        defpackage.ajvi ajviVarE = e(ajvbVar);
        int iOrdinal = ajviVarE.b().ordinal();
        if (iOrdinal == 0) {
            g(ajviVarE.a() << 3);
            h(j);
        } else if (iOrdinal == 1) {
            g(ajviVarE.a() << 3);
            h((j << 1) ^ (j >> 63));
        } else if (iOrdinal == 2) {
            g((ajviVarE.a() << 3) | 1);
            this.f.write(f(8).putLong(j).array());
        }
    }

    public final void c(defpackage.ajvb ajvbVar, java.lang.Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof java.lang.CharSequence) {
                java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
                if (z && charSequence.length() == 0) {
                    return;
                }
                g((d(ajvbVar) << 3) | 2);
                byte[] bytes = charSequence.toString().getBytes(d);
                g(bytes.length);
                this.f.write(bytes);
                return;
            }
            if (obj instanceof java.util.Collection) {
                java.util.Iterator it = ((java.util.Collection) obj).iterator();
                while (it.hasNext()) {
                    c(ajvbVar, it.next(), false);
                }
                return;
            }
            if (obj instanceof java.util.Map) {
                java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    i(e, ajvbVar, (java.util.Map.Entry) it2.next(), false);
                }
                return;
            }
            if (obj instanceof java.lang.Double) {
                double dDoubleValue = ((java.lang.Double) obj).doubleValue();
                if (z && dDoubleValue == 0.0d) {
                    return;
                }
                g((d(ajvbVar) << 3) | 1);
                this.f.write(f(8).putDouble(dDoubleValue).array());
                return;
            }
            if (obj instanceof java.lang.Float) {
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                if (z && fFloatValue == 0.0f) {
                    return;
                }
                g((d(ajvbVar) << 3) | 5);
                this.f.write(f(4).putFloat(fFloatValue).array());
                return;
            }
            if (obj instanceof java.lang.Number) {
                b(ajvbVar, ((java.lang.Number) obj).longValue(), z);
                return;
            }
            if (obj instanceof java.lang.Boolean) {
                a(ajvbVar, ((java.lang.Boolean) obj).booleanValue() ? 1 : 0, z);
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return;
                }
                g((d(ajvbVar) << 3) | 2);
                g(bArr.length);
                this.f.write(bArr);
                return;
            }
            defpackage.ajvc ajvcVar = (defpackage.ajvc) this.c.get(obj.getClass());
            if (ajvcVar != null) {
                i(ajvcVar, ajvbVar, obj, z);
                return;
            }
            defpackage.ajvd ajvdVar = (defpackage.ajvd) this.g.get(obj.getClass());
            if (ajvdVar != null) {
                ajvdVar.a(obj, this.i);
                return;
            }
            if (obj instanceof defpackage.ajvg) {
                a(ajvbVar, ((defpackage.ajvg) obj).a(), true);
            } else if (obj instanceof java.lang.Enum) {
                a(ajvbVar, ((java.lang.Enum) obj).ordinal(), true);
            } else {
                i(this.h, ajvbVar, obj, z);
            }
        }
    }
}
