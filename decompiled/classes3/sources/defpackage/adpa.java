package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpa {
    private static final aimz b = aimz.i("com/google/android/libraries/micore/telephony/common/audio/common/AudioSystemApiUtil");
    public static final java.lang.Class[] a = {java.lang.Integer.TYPE};
    private static final java.lang.Class[] c = {android.content.Context.class};
    private static final java.lang.Class[] d = {java.lang.Integer.TYPE, java.lang.Object.class};
    private static final java.lang.Class[] e = {java.lang.Integer.TYPE, java.lang.Object.class};
    private static final java.lang.Class[] f = {android.media.AudioFormat.class};
    private static final java.lang.Class[] g = {java.lang.Integer.TYPE};
    private static final java.lang.Class[] h = new java.lang.Class[0];

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    public static java.lang.Class a(java.lang.String str) throws adpd {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e2) {
            b.c().k(e2).l("com/google/android/libraries/micore/telephony/common/audio/common/AudioSystemApiUtil", "getClassWithName", 350, "AudioSystemApiUtil.java").y("Failed to obtain class: %s", str);
            throw new adpd(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    public static java.lang.Object b(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Class cls2, java.lang.Object obj, java.lang.Object... objArr) throws adpd {
        try {
            java.lang.Object objInvoke = cls.getMethod(str, clsArr).invoke(obj, objArr);
            if (cls2 != null) {
                c(objInvoke, cls2);
            }
            return objInvoke;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            b.c().k(e2).l("com/google/android/libraries/micore/telephony/common/audio/common/AudioSystemApiUtil", "invokeMethod", 374, "AudioSystemApiUtil.java").y("Failed to invoke method %s", str);
            throw new adpd(e2);
        }
    }

    public static void c(java.lang.Object obj, java.lang.Class cls) {
        if (cls.isInstance(obj)) {
            return;
        }
        if (obj == null) {
            throw new adpd("Object expected to be ".concat(java.lang.String.valueOf(cls.getSimpleName())));
        }
        throw new adpd("Object expected to be " + cls.getSimpleName() + " but is: " + obj.getClass().getSimpleName());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    public static defpackage.vqf d(int i, android.media.AudioAttributes audioAttributes, int i2, java.lang.Object obj) throws adpd {
        java.lang.Class clsA = a("android.media.audiopolicy.AudioMixingRule$Builder");
        try {
            java.lang.Object objNewInstance = clsA.getDeclaredConstructor(null).newInstance(null);
            b(clsA, "addMixRule", d, null, objNewInstance, java.lang.Integer.valueOf(i), audioAttributes);
            if (i2 > 0 && obj != null) {
                b(clsA, "excludeMixRule", e, null, objNewInstance, java.lang.Integer.valueOf(i2), obj);
            }
            java.lang.Object objB = b(clsA, "build", h, a("android.media.audiopolicy.AudioMixingRule"), objNewInstance, new java.lang.Object[0]);
            if (objB != null) {
                return new defpackage.vqf(objB, "android.media.audiopolicy.AudioMixingRule");
            }
            throw new adpd("AudioMixingRule$Builder.build() returned null");
        } catch (java.lang.ReflectiveOperationException e2) {
            a.by(b.c(), "Failed to create AudioMixingRule", "com/google/android/libraries/micore/telephony/common/audio/common/AudioSystemApiUtil", "createAudioMixingRule", (char) 180, "AudioSystemApiUtil.java", e2);
            throw new adpd(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    public static defpackage.vqf e(android.content.Context context, java.util.List list) throws adpd {
        java.lang.Class clsA = a("android.media.audiopolicy.AudioPolicy$Builder");
        try {
            java.lang.Object objNewInstance = clsA.getConstructor(c).newInstance(context);
            ailk ailkVarY = ((aify) list).y(0);
            while (ailkVarY.hasNext()) {
                b(clsA, "addMix", new java.lang.Class[]{a("android.media.audiopolicy.AudioMix")}, null, objNewInstance, ((defpackage.vqf) ailkVarY.next()).a);
            }
            java.lang.Object objB = b(clsA, "build", h, a("android.media.audiopolicy.AudioPolicy"), objNewInstance, new java.lang.Object[0]);
            if (objB != null) {
                return new defpackage.vqf(objB, "android.media.audiopolicy.AudioPolicy");
            }
            throw new adpd("AudioPolicy$Builder.build() returned null");
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            a.by(b.c(), "Failed to create AudioPolicy", "com/google/android/libraries/micore/telephony/common/audio/common/AudioSystemApiUtil", "createAudioPolicy", (char) 295, "AudioSystemApiUtil.java", e2);
            throw new adpd(e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: adpd */
    public static defpackage.vqf f(defpackage.vqf vqfVar, android.media.AudioFormat audioFormat) throws adpd {
        java.lang.Class clsA = a("android.media.audiopolicy.AudioMix$Builder");
        try {
            java.lang.Object objNewInstance = clsA.getConstructor(a("android.media.audiopolicy.AudioMixingRule")).newInstance(vqfVar.a);
            b(clsA, "setFormat", f, null, objNewInstance, audioFormat);
            b(clsA, "setRouteFlags", g, null, objNewInstance, 2);
            java.lang.Object objB = b(clsA, "build", h, a("android.media.audiopolicy.AudioMix"), objNewInstance, new java.lang.Object[0]);
            if (objB != null) {
                return new defpackage.vqf(objB, "android.media.audiopolicy.AudioMix");
            }
            throw new adpd("AudioMix$Builder.build() returned null");
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            a.by(b.c(), "Failed to create AudioMix", "com/google/android/libraries/micore/telephony/common/audio/common/AudioSystemApiUtil", "createAudioMix", (char) 251, "AudioSystemApiUtil.java", e2);
            throw new adpd(e2);
        }
    }
}
