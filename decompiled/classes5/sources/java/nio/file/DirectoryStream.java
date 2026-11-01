package java.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface DirectoryStream<T> extends java.io.Closeable, java.lang.Iterable<T> {

    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public interface Filter<T> {
        /* JADX INFO: renamed from: accept */
        boolean mo0accept(T t) throws java.io.IOException;
    }

    java.util.Iterator<T> iterator();
}
