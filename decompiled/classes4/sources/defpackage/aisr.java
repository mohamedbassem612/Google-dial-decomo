package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aisr {
    private static final java.util.Map a = new java.util.HashMap();

    private aisr() {
    }

    public static synchronized void a() {
        java.lang.String str;
        if (((java.lang.String) a.get("speech/greco3/api/libgoogle_recognizer_jni.so")) == null) {
            java.io.InputStream resourceAsStream = defpackage.aisr.class.getClassLoader() != null ? defpackage.aisr.class.getClassLoader().getResourceAsStream("speech/greco3/api/libgoogle_recognizer_jni.so") : java.lang.ClassLoader.getSystemResourceAsStream("speech/greco3/api/libgoogle_recognizer_jni.so");
            char c = ')';
            if (resourceAsStream != null) {
                try {
                    java.lang.String strB = b();
                    java.lang.String str2 = java.lang.System.getProperty("java.io.tmpdir") + java.io.File.separator + java.lang.System.currentTimeMillis() + '-';
                    for (int i = 1; i < 10000; i++) {
                        java.io.File file = new java.io.File(str2 + i);
                        if (file.mkdirs()) {
                            try {
                                java.io.File canonicalFile = file.getCanonicalFile();
                                canonicalFile.deleteOnExit();
                                java.io.File file2 = new java.io.File(canonicalFile, strB);
                                try {
                                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                    try {
                                        byte[] bArr = new byte[4096];
                                        while (true) {
                                            int i2 = resourceAsStream.read(bArr);
                                            if (i2 == -1) {
                                                fileOutputStream.close();
                                                resourceAsStream.close();
                                                file2.deleteOnExit();
                                                e(file2);
                                                return;
                                            }
                                            fileOutputStream.write(bArr, 0, i2);
                                            resourceAsStream.close();
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (java.lang.Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    resourceAsStream.close();
                                    throw th3;
                                }
                            } catch (java.io.IOException unused) {
                                continue;
                            }
                        }
                    }
                    throw new java.lang.AssertionError("Failed to create any usable temp directory between " + str2 + "1 and " + str2 + "9999, where java.io.tmpdir=" + java.lang.System.getProperty("java.io.tmpdir") + c);
                } catch (java.io.IOException e) {
                    java.lang.UnsatisfiedLinkError unsatisfiedLinkError = new java.lang.UnsatisfiedLinkError("Failed while writing input stream to temp file 'speech/greco3/api/libgoogle_recognizer_jni.so': ".concat(java.lang.String.valueOf(e.getMessage())));
                    unsatisfiedLinkError.initCause(e);
                    throw unsatisfiedLinkError;
                }
            }
            java.lang.String strB2 = b();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't find classloader resource 'speech/greco3/api/libgoogle_recognizer_jni.so'");
            java.lang.String strC = c(sb);
            if (strC == null) {
                java.lang.String property = java.lang.System.getProperty("os.name");
                if (property.equals("Mac OS X")) {
                    str = ".dylib";
                } else {
                    if (!property.equals("Linux")) {
                        throw new java.lang.IllegalStateException(a.bp((byte) 41, property, "Don't know how to unmap library name in current platform ("));
                    }
                    str = ".so";
                }
                if (strB2.length() > str.length() + 3 && strB2.startsWith("lib") && strB2.endsWith(str)) {
                    strB2 = strB2.substring(3, strB2.length() - str.length());
                }
                strC = d(strB2, sb);
            }
            if (strC == null) {
                throw new java.lang.UnsatisfiedLinkError(sb.toString());
            }
        }
    }

    private static java.lang.String b() {
        return "speech/greco3/api/libgoogle_recognizer_jni.so".substring(18);
    }

    private static java.lang.String c(java.lang.StringBuilder sb) {
        try {
            java.lang.System.load("speech/greco3/api/libgoogle_recognizer_jni.so");
            a.put("speech/greco3/api/libgoogle_recognizer_jni.so", "speech/greco3/api/libgoogle_recognizer_jni.so");
            return "speech/greco3/api/libgoogle_recognizer_jni.so";
        } catch (java.lang.UnsatisfiedLinkError e) {
            sb.append(". Couldn't load(speech/greco3/api/libgoogle_recognizer_jni.so): ".concat(java.lang.String.valueOf(e.getMessage())));
            return null;
        }
    }

    private static java.lang.String d(java.lang.String str, java.lang.StringBuilder sb) {
        try {
            java.lang.System.loadLibrary(str);
            a.put("speech/greco3/api/libgoogle_recognizer_jni.so", str);
            return str;
        } catch (java.lang.UnsatisfiedLinkError e) {
            sb.append(". Couldn't loadLibrary(" + str + "): " + e.getMessage());
            return null;
        }
    }

    private static void e(java.io.File file) {
        try {
            java.lang.System.load(file.getPath());
            a.put("speech/greco3/api/libgoogle_recognizer_jni.so", file.getPath());
            file.getPath();
        } catch (java.lang.UnsatisfiedLinkError e) {
            java.lang.String message = e.getMessage();
            java.lang.String property = java.lang.System.getProperty("sun.arch.data.model");
            if ((!message.contains("ELFCLASS64") || !"32".equals(property)) && (!message.contains("ELFCLASS32") || !"64".equals(property))) {
                throw e;
            }
            java.lang.UnsatisfiedLinkError unsatisfiedLinkError = new java.lang.UnsatisfiedLinkError(e.getMessage() + ". If you built this binary from google3, then you need to use the flag --java_cpu=" + (true != property.equals("32") ? "k8" : "piii") + ".  Failure to do so may cause unpredictable and serious failures.");
            unsatisfiedLinkError.setStackTrace(e.getStackTrace());
            throw unsatisfiedLinkError;
        }
    }
}
