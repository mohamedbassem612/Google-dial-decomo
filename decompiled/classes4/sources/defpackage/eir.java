package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class eir extends eis {
    public final double a(java.lang.Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public final float b(java.lang.Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public final void c(java.lang.Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public final void d(java.lang.Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public final void e(java.lang.Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public final boolean f(java.lang.Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public final void g() {
        try {
            java.lang.Class<?> cls = ((eis) this).a.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", java.lang.Object.class, java.lang.Long.TYPE);
            if (eit.g() != null) {
                try {
                    java.lang.Class<?> cls2 = this.a.getClass();
                    cls2.getMethod("getByte", java.lang.Long.TYPE);
                    cls2.getMethod("putByte", java.lang.Long.TYPE, java.lang.Byte.TYPE);
                    cls2.getMethod("getInt", java.lang.Long.TYPE);
                    cls2.getMethod("putInt", java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    cls2.getMethod("getLong", java.lang.Long.TYPE);
                    java.lang.Class<?> cls3 = java.lang.Long.TYPE;
                    cls2.getMethod("putLong", cls3, cls3);
                    java.lang.Class<?> cls4 = java.lang.Long.TYPE;
                    cls2.getMethod("copyMemory", cls4, cls4, cls4);
                    java.lang.Class<?> cls5 = java.lang.Long.TYPE;
                    cls2.getMethod("copyMemory", java.lang.Object.class, cls5, java.lang.Object.class, cls5, cls5);
                } catch (java.lang.Throwable th) {
                    eit.i(th);
                }
            }
        } catch (java.lang.Throwable th2) {
            eit.i(th2);
        }
    }

    public final boolean h() {
        if (!super.h()) {
            return false;
        }
        try {
            java.lang.Class<?> cls = this.a.getClass();
            cls.getMethod("getByte", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putByte", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Byte.TYPE);
            cls.getMethod("getBoolean", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putBoolean", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
            cls.getMethod("getFloat", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putFloat", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Float.TYPE);
            cls.getMethod("getDouble", java.lang.Object.class, java.lang.Long.TYPE);
            cls.getMethod("putDouble", java.lang.Object.class, java.lang.Long.TYPE, java.lang.Double.TYPE);
            return true;
        } catch (java.lang.Throwable th) {
            eit.i(th);
            return false;
        }
    }
}
