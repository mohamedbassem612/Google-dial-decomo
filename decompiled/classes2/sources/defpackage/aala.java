package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aala extends ylc implements aalb {
    private final java.lang.Object a;

    public aala(java.lang.Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.a = obj;
    }

    public static java.lang.Object a(aalb aalbVar) {
        if (aalbVar instanceof defpackage.aala) {
            return ((defpackage.aala) aalbVar).a;
        }
        android.os.IBinder iBinderAsBinder = aalbVar.asBinder();
        java.lang.reflect.Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new java.lang.IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        aais.as(field);
        if (field.isAccessible()) {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (java.lang.NullPointerException e2) {
            throw new java.lang.IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public aala() {
        throw null;
    }
}
