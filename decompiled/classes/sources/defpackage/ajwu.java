package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajwu {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("[0-9]+s");
    private static final java.nio.charset.Charset b = java.nio.charset.Charset.forName("UTF-8");
    private final android.content.Context c;
    private final defpackage.ajwe d;
    private final defpackage.ajww e = new defpackage.ajww();

    public ajwu(android.content.Context context, defpackage.ajwe ajweVar) {
        this.c = context;
        this.d = ajweVar;
    }

    static long a(java.lang.String str) {
        defpackage.aais.aj(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return java.lang.Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static void d(java.net.URLConnection uRLConnection, byte[] bArr) throws java.io.IOException {
        java.io.OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new java.io.IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static boolean e(int i) {
        return i >= 200 && i < 300;
    }

    private static byte[] f(org.json.JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static final java.net.URL g(java.lang.String str) throws defpackage.ajwj {
        try {
            return new java.net.URL(java.lang.String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (java.net.MalformedURLException e) {
            throw new defpackage.ajwj(e.getMessage());
        }
    }

    private static void h(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        java.io.InputStream errorStream = httpURLConnection.getErrorStream();
        java.lang.String str2 = null;
        if (errorStream != null) {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(errorStream, b));
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str2 = java.lang.String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", java.lang.Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th) {
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused3) {
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        android.util.Log.w("Firebase-Installations", str2);
        android.util.Log.w("Firebase-Installations", java.lang.String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los", "chime-sdk", android.text.TextUtils.isEmpty(str) ? "" : ", ".concat(java.lang.String.valueOf(str))));
    }

    private final java.net.HttpURLConnection i(java.net.URL url) throws defpackage.ajwj {
        java.security.MessageDigest messageDigestA;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.c.getPackageName());
            defpackage.ajvs ajvsVar = (defpackage.ajvs) this.d.a();
            if (ajvsVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (java.lang.String) defpackage.aazc.t(ajvsVar.a()));
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    android.util.Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (java.util.concurrent.ExecutionException e2) {
                    android.util.Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            java.lang.String string = null;
            try {
                android.content.Context context = this.c;
                java.lang.String packageName = context.getPackageName();
                int i = defpackage.aail.a;
                android.content.pm.PackageInfo packageInfoC = defpackage.aaiy.b(context).c(packageName, 64);
                byte[] bArrDigest = (packageInfoC.signatures == null || packageInfoC.signatures.length != 1 || (messageDigestA = defpackage.aail.a("SHA1")) == null) ? null : messageDigestA.digest(packageInfoC.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    android.util.Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    char[] cArr = aaiq.a;
                    int length = bArrDigest.length;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(length << 1);
                    for (int i2 = 0; i2 < length; i2++) {
                        char[] cArr2 = aaiq.a;
                        sb.append(cArr2[(bArrDigest[i2] & 240) >>> 4]);
                        sb.append(cArr2[bArrDigest[i2] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                android.util.Log.e("ContentValues", "No such package: ".concat(java.lang.String.valueOf(this.c.getPackageName())), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", "AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los");
            return httpURLConnection;
        } catch (java.io.IOException unused) {
            throw new defpackage.ajwj("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final ajwv b(java.lang.String str, java.lang.String str2) throws defpackage.ajwj {
        ajwv ajwvVar;
        java.io.InputStream inputStream;
        defpackage.ajwu ajwuVar = this;
        if (!ajwuVar.e.b()) {
            throw new defpackage.ajwj("Firebase Installations Service is unavailable. Please try again later.");
        }
        ?? r6 = 1;
        int i = 0;
        java.net.URL urlG = g(java.lang.String.format("projects/%s/installations", "chime-sdk"));
        while (i <= r6) {
            android.net.TrafficStats.setThreadStatsTag(32769);
            java.net.HttpURLConnection httpURLConnectionI = ajwuVar.i(urlG);
            try {
                try {
                    httpURLConnectionI.setRequestMethod("POST");
                    httpURLConnectionI.setDoOutput(r6);
                    if (str2 != null) {
                        httpURLConnectionI.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("fid", str);
                        jSONObject.put("appId", "1:747654520220:android:0000000000000000");
                        jSONObject.put("authVersion", "FIS_v2");
                        jSONObject.put("sdkVersion", "a:19.1.1_1p");
                        d(httpURLConnectionI, f(jSONObject));
                        int responseCode = httpURLConnectionI.getResponseCode();
                        ajwuVar.e.a(responseCode);
                        if (e(responseCode)) {
                            java.io.InputStream inputStream2 = httpURLConnectionI.getInputStream();
                            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream2, b));
                            ajwx ajwxVarA = ajwy.a();
                            jsonReader.beginObject();
                            java.lang.String strNextString = null;
                            java.lang.String strNextString2 = null;
                            java.lang.String strNextString3 = null;
                            ajwy ajwyVarA = null;
                            while (jsonReader.hasNext()) {
                                java.lang.String strNextName = jsonReader.nextName();
                                if (strNextName.equals("name")) {
                                    strNextString = jsonReader.nextString();
                                } else if (strNextName.equals("fid")) {
                                    strNextString2 = jsonReader.nextString();
                                } else if (strNextName.equals("refreshToken")) {
                                    strNextString3 = jsonReader.nextString();
                                } else {
                                    if (strNextName.equals("authToken")) {
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            java.lang.String strNextName2 = jsonReader.nextName();
                                            if (strNextName2.equals("token")) {
                                                ajwxVarA.a = jsonReader.nextString();
                                            } else {
                                                if (strNextName2.equals("expiresIn")) {
                                                    ajwxVarA.b(a(jsonReader.nextString()));
                                                } else {
                                                    jsonReader.skipValue();
                                                }
                                                inputStream2 = inputStream2;
                                            }
                                        }
                                        inputStream = inputStream2;
                                        ajwyVarA = ajwxVarA.a();
                                        jsonReader.endObject();
                                    } else {
                                        inputStream = inputStream2;
                                        jsonReader.skipValue();
                                    }
                                    inputStream2 = inputStream;
                                }
                            }
                            jsonReader.endObject();
                            jsonReader.close();
                            inputStream2.close();
                            ajwvVar = new ajwv(strNextString, strNextString2, strNextString3, ajwyVarA, 1);
                        } else {
                            h(httpURLConnectionI, "1:747654520220:android:0000000000000000");
                            if (responseCode == 429) {
                                throw new defpackage.ajwj("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                android.util.Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ajwvVar = new ajwv((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ajwy) null, 2);
                            } else {
                                httpURLConnectionI.disconnect();
                                android.net.TrafficStats.clearThreadStatsTag();
                                i++;
                                r6 = 1;
                                ajwuVar = this;
                            }
                        }
                        httpURLConnectionI.disconnect();
                        android.net.TrafficStats.clearThreadStatsTag();
                        return ajwvVar;
                    } catch (org.json.JSONException e) {
                        throw new java.lang.IllegalStateException(e);
                    }
                } catch (java.lang.Throwable th) {
                    httpURLConnectionI.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (java.io.IOException | java.lang.AssertionError unused) {
            }
        }
        throw new defpackage.ajwj("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final ajwy c(java.lang.String str, java.lang.String str2) throws defpackage.ajwj {
        ajwy ajwyVarA;
        if (!this.e.b()) {
            throw new defpackage.ajwj("Firebase Installations Service is unavailable. Please try again later.");
        }
        java.net.URL urlG = g(java.lang.String.format("projects/%s/installations/%s/authTokens:generate", "chime-sdk", str));
        for (int i = 0; i <= 1; i++) {
            android.net.TrafficStats.setThreadStatsTag(32771);
            java.net.HttpURLConnection httpURLConnectionI = i(urlG);
            try {
                try {
                    httpURLConnectionI.setRequestMethod("POST");
                    httpURLConnectionI.addRequestProperty("Authorization", defpackage.a.bx(str2, "FIS_v2 "));
                    httpURLConnectionI.setDoOutput(true);
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("sdkVersion", "a:19.1.1_1p");
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("installation", jSONObject);
                        d(httpURLConnectionI, f(jSONObject2));
                        int responseCode = httpURLConnectionI.getResponseCode();
                        this.e.a(responseCode);
                        if (e(responseCode)) {
                            java.io.InputStream inputStream = httpURLConnectionI.getInputStream();
                            android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream, b));
                            ajwx ajwxVarA = ajwy.a();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                java.lang.String strNextName = jsonReader.nextName();
                                if (strNextName.equals("token")) {
                                    ajwxVarA.a = jsonReader.nextString();
                                } else if (strNextName.equals("expiresIn")) {
                                    ajwxVarA.b(a(jsonReader.nextString()));
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            jsonReader.close();
                            inputStream.close();
                            ajwxVarA.b = 1;
                            ajwyVarA = ajwxVarA.a();
                        } else {
                            h(httpURLConnectionI, null);
                            if (responseCode == 401 || responseCode == 404) {
                                ajwx ajwxVarA2 = ajwy.a();
                                ajwxVarA2.b = 3;
                                ajwyVarA = ajwxVarA2.a();
                            } else {
                                if (responseCode == 429) {
                                    throw new defpackage.ajwj("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                }
                                if (responseCode < 500 || responseCode >= 600) {
                                    android.util.Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    ajwx ajwxVarA3 = ajwy.a();
                                    ajwxVarA3.b = 2;
                                    ajwyVarA = ajwxVarA3.a();
                                } else {
                                    httpURLConnectionI.disconnect();
                                    android.net.TrafficStats.clearThreadStatsTag();
                                }
                            }
                        }
                        httpURLConnectionI.disconnect();
                        android.net.TrafficStats.clearThreadStatsTag();
                        return ajwyVarA;
                    } catch (org.json.JSONException e) {
                        throw new java.lang.IllegalStateException(e);
                    }
                } catch (java.io.IOException | java.lang.AssertionError unused) {
                }
            } catch (java.lang.Throwable th) {
                httpURLConnectionI.disconnect();
                android.net.TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new defpackage.ajwj("Firebase Installations Service is unavailable. Please try again later.");
    }
}
