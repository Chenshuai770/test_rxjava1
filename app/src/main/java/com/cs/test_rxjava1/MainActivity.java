package com.cs.test_rxjava1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.observables.GroupedObservable;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private String TAG = "TAG";
    private Button mBtn2;
    private Integer[] items = {0, 1, 2, 3, 4, 5};
    private Button mBtn3;
    private Button mBtn4;
    private Button mBtn5;
    private Button mBtn6;
    private Button mBtn7;
    private Button mBtn8;
    private Button mBtn9;
    private Button mBtn10;
    private Button mBtn11;
    private Button mBtn12;
    private Button mBtn13;
    private Button mBtn14;
    private Button mBtn15;
    private Button mBtn16;
    private Button mBtn17;
    private Button mBtn18;
    private Button mBtn19;
    private Button mBtn20;
    private Button mBtn21;
    private Button mBtn22;
    private Button mBtn23;
    private Button mBtn24;
    private Button mBtn25;
    private Button mBtn26;
    private Button mBtn27;
    private Button mBtn28;
    private Button mBtn29;
    private Button mBtn30;
    private Button mBtn31;
    private Button mBtn32;
    private Button mBtn33;
    private Button mBtn34;
    private Button mBtn35;
    private Button mBtn36;
    private Button mBtn37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        mBtn2 = (Button) findViewById(R.id.btn2);
        mBtn2.setOnClickListener(this);
        mBtn3 = (Button) findViewById(R.id.btn3);
        mBtn3.setOnClickListener(this);
        mBtn4 = (Button) findViewById(R.id.btn4);
        mBtn4.setOnClickListener(this);
        mBtn5 = (Button) findViewById(R.id.btn5);
        mBtn5.setOnClickListener(this);
        mBtn6 = (Button) findViewById(R.id.btn6);
        mBtn6.setOnClickListener(this);
        mBtn7 = (Button) findViewById(R.id.btn7);
        mBtn7.setOnClickListener(this);
        mBtn8 = (Button) findViewById(R.id.btn8);
        mBtn8.setOnClickListener(this);
        mBtn9 = (Button) findViewById(R.id.btn9);
        mBtn9.setOnClickListener(this);
        mBtn10 = (Button) findViewById(R.id.btn10);
        mBtn10.setOnClickListener(this);
        mBtn11 = (Button) findViewById(R.id.btn11);
        mBtn11.setOnClickListener(this);
        mBtn12 = (Button) findViewById(R.id.btn12);
        mBtn12.setOnClickListener(this);
        mBtn13 = (Button) findViewById(R.id.btn13);
        mBtn13.setOnClickListener(this);
        mBtn14 = (Button) findViewById(R.id.btn14);
        mBtn14.setOnClickListener(this);
        mBtn15 = (Button) findViewById(R.id.btn15);
        mBtn15.setOnClickListener(this);
        mBtn16 = (Button) findViewById(R.id.btn16);
        mBtn16.setOnClickListener(this);
        mBtn17 = (Button) findViewById(R.id.btn17);
        mBtn17.setOnClickListener(this);
        mBtn18 = (Button) findViewById(R.id.btn18);
        mBtn18.setOnClickListener(this);
        mBtn19 = (Button) findViewById(R.id.btn19);
        mBtn19.setOnClickListener(this);
        mBtn20 = (Button) findViewById(R.id.btn20);
        mBtn20.setOnClickListener(this);
        mBtn21 = (Button) findViewById(R.id.btn21);
        mBtn21.setOnClickListener(this);
        mBtn22 = (Button) findViewById(R.id.btn22);
        mBtn22.setOnClickListener(this);
        mBtn23 = (Button) findViewById(R.id.btn23);
        mBtn23.setOnClickListener(this);
        mBtn24 = (Button) findViewById(R.id.btn24);
        mBtn24.setOnClickListener(this);
        mBtn25 = (Button) findViewById(R.id.btn25);
        mBtn25.setOnClickListener(this);
        mBtn26 = (Button) findViewById(R.id.btn26);
        mBtn26.setOnClickListener(this);
        mBtn27 = (Button) findViewById(R.id.btn27);
        mBtn27.setOnClickListener(this);
        mBtn28 = (Button) findViewById(R.id.btn28);
        mBtn28.setOnClickListener(this);
        mBtn29 = (Button) findViewById(R.id.btn29);
        mBtn29.setOnClickListener(this);
        mBtn30 = (Button) findViewById(R.id.btn30);
        mBtn30.setOnClickListener(this);
        mBtn31 = (Button) findViewById(R.id.btn31);
        mBtn31.setOnClickListener(this);
        mBtn32 = (Button) findViewById(R.id.btn32);
        mBtn32.setOnClickListener(this);
        mBtn33 = (Button) findViewById(R.id.btn33);
        mBtn33.setOnClickListener(this);
        mBtn34 = (Button) findViewById(R.id.btn34);
        mBtn34.setOnClickListener(this);
        mBtn35 = (Button) findViewById(R.id.btn35);
        mBtn35.setOnClickListener(this);
        mBtn36 = (Button) findViewById(R.id.btn36);
        mBtn36.setOnClickListener(this);
        mBtn37 = (Button) findViewById(R.id.btn37);
        mBtn37.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                create();
                break;
            case R.id.btn2:
                //from可以从对应数据中获得数据
                from();
                break;
            case R.id.btn3:
                interval();
                break;
            case R.id.btn4:
                //just();
                just2();
                break;
            case R.id.btn5:
                range();
                break;
            case R.id.btn6:
                repeat();
                break;
            case R.id.btn7:
                timer();
                break;
            case R.id.btn8:
                buffer();
                break;
            case R.id.btn9:
                flatmap();
                break;
            case R.id.btn10:
                distinct();
                break;
            case R.id.btn11:
                elementat();
                break;
            case R.id.btn12:
                filter();
                break;
            case R.id.btn13:
                first();
                break;
            case R.id.btn14:
                ignoreElements();
                break;
            case R.id.btn15:
                last();
                break;
            case R.id.btn16:
                skip();
                break;
            case R.id.btn17:
                skipLast();
                break;
            case R.id.btn18:
                take();
                break;
            case R.id.btn19:
                //takelast();
                takelastbuffer();
                break;
            case R.id.btn20:
                merge();

                break;
            case R.id.btn21:
                startWith();
                break;
            case R.id.btn22:
                doOnNext();

                break;
            case R.id.btn23:
                tolist();
                break;
            case R.id.btn24:
                groupBy();
                break;
            case R.id.btn25:
                scan();
                break;
            case R.id.btn26:
                window();
                break;
            case R.id.btn27:
                debounce();
                break;
            case R.id.btn28:
                oftype();
                break;
            case R.id.btn29:
                single();
                break;
            case R.id.btn30:
                ignoreElements1();
                break;
            case R.id.btn31:
                sample();
                break;
            case R.id.btn32:
                combining();
                break;
            case R.id.btn33:
                zip();
                break;
            case R.id.btn34:
                onErrorReturn();
                break;
            case R.id.btn35:
                onErrorResumeNext();

                break;
            case R.id.btn36:
                retry();
                break;
            case R.id.btn37:
                Observable<Integer> observable = Observable.create(new Observable.OnSubscribe<Integer>() {
                    @Override
                    public void call(Subscriber<? super Integer> subscriber) {
                        System.out.println("subscribing");
                        subscriber.onError(new RuntimeException("always fails"));
                    }
                });
                observable.retryWhen(new Func1<Observable<? extends Throwable>, Observable<?>>() {
                    @Override
                    public Observable<?> call(Observable<? extends Throwable> observable) {
                        return observable.zipWith(Observable.range(1, 3), new Func2<Throwable, Integer, Integer>() {
                            @Override
                            public Integer call(Throwable throwable, Integer integer) {
                                return integer;
                            }
                        }).flatMap(new Func1<Integer, Observable<?>>() {
                            @Override
                            public Observable<?> call(Integer integer) {
                                System.out.println("delay retry by " + integer + " second(s)");
                                //每一秒中执行一次
                                return Observable.timer(integer, TimeUnit.SECONDS);
                            }
                        });
                    }
                }).subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("Sequence complete.");
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.err.println("Error: " + e.getMessage());
                    }

                    @Override
                    public void onNext(Integer value) {
                        System.out.println("Next:" + value);
                    }
                });

                break;
        }
    }

    /**
     * retry操作符是当Observable发生错误或者异常时，重新尝试执行Observable的逻辑，如果经过n次重新尝试执行后仍然出现错误或者异常，则最后回调执行onError方法；当然如果源Observable没有错误或者异常出现，则按照正常流程执行
     */
    private void retry() {
        Observable<Integer> integerObservable = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (subscriber.isUnsubscribed()) return;
                //循环输出数字
                try {
                    for (int i = 0; i < 10; i++) {
                        if (i == 4) {
                            throw new Exception("this is number 4 error！");
                        }
                        subscriber.onNext(i);
                    }
                    subscriber.onCompleted();
                } catch (Throwable e) {
                    subscriber.onError(e);
                }
            }
        });
        integerObservable.retry(2).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("Sequence complete.");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());
            }

            @Override
            public void onNext(Integer value) {
                Log.d(TAG, "onNext: " + value);
            }
        });
    }

    /**
     * onErrorResumeNext操作符跟onErrorReturn类似，只不过onErrorReturn只能在错误或异常发生时只返回一个和源Observable相同类型的结果，而onErrorResumeNext操作符是在错误或异常发生时返回一个Observable，也就是说可以返回多个和源Observable相同类型的结果，其流程图如下：
     */
    private void onErrorResumeNext() {
        Observable<Integer> observable = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (subscriber.isUnsubscribed()) return;
                //循环输出数字
                try {
                    for (int i = 0; i < 10; i++) {
                        if (i == 4) {
                            throw new Exception("this is number 4 error！");
                        }
                        subscriber.onNext(i);
                    }
                    subscriber.onCompleted();
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        });

        observable.onErrorResumeNext(new Func1<Throwable, Observable<? extends Integer>>() {
            @Override
            public Observable<? extends Integer> call(Throwable throwable) {
                return Observable.just(100, 101, 102);
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("Sequence complete.");
            }

            @Override
            public void onError(Throwable e) {
                // System.err.println("Error: " + e.getMessage());
                Log.d(TAG, "onError: " + e.getMessage());
            }

            @Override
            public void onNext(Integer value) {
                // System.out.println("Next:" + value);
                Log.d(TAG, "onNext: " + value);
            }
        });
    }

    /**
     * onErrorReturn
     * onErrorReturn操作符是在Observable发生错误或异常的时候（即将回调oError方法时），拦截错误并执行指定的逻辑，返回一个跟源Observable相同类型的结果，最后回调订阅者的onComplete方法，其流程图如下：
     */
    private void onErrorReturn() {
        Observable<Integer> observable = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (subscriber.isUnsubscribed()) return;
                //循环输出数字
                try {
                    for (int i = 0; i < 10; i++) {
                        if (i == 4) {
                            throw new Exception("this is number 4 error！");
                        }
                        subscriber.onNext(i);
                    }
                    subscriber.onCompleted();
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        });
        observable.onErrorReturn(new Func1<Throwable, Integer>() {
            @Override
            public Integer call(Throwable throwable) {
                return 1004;
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompletd");

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "onNext:" + integer);

            }
        });
    }

    /**
     * zip操作符是把两个observable提交的结果，严格按照顺序进行合并,
     * 最后一个参数没有则不进行合并
     */
    private void zip() {
        Observable<Integer> observable1 = Observable.just(10, 20, 30);
        Observable<Integer> observable2 = Observable.just(4, 8, 12, 16);
        Observable.zip(observable1, observable2, new Func2<Integer, Integer, Integer>() {
            @Override
            public Integer call(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "onNext: " + integer);

            }
        });
    }

    /**
     * combineLatest操作符
     * 合并操作符
     * combineLatest操作符把两个Observable产生的结果进行合并，合并的结果组成一个新的Observable。这两个Observable中任意一个Observable产生的结果，都和另一个Observable最后产生的结果，按照一定的规则进行合并。流程图如下：
     */
    private void combining() {
        Observable<Long> observable1 = Observable.interval(0, 1000, TimeUnit.MILLISECONDS)
                .map(new Func1<Long, Long>() {
                    @Override
                    public Long call(Long aLong) {
                        return aLong * 5;
                    }
                }).take(5);
        //产生0,10,20,30,40数列
        Observable<Long> observable2 = Observable.timer(500, 1000, TimeUnit.MILLISECONDS)
                .map(new Func1<Long, Long>() {
                    @Override
                    public Long call(Long aLong) {
                        return aLong * 10;
                    }
                }).take(5);
        Observable.combineLatest(observable1, observable2, new Func2<Long, Long, Long>() {
            @Override
            public Long call(Long aLong, Long aLong2) {
                return aLong + aLong2;
            }
        }).subscribe(new Subscriber<Long>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted: " + "onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();

            }

            @Override
            public void onNext(Long aLong) {

                Log.d(TAG, "onNext: " + aLong);
            }
        });
    }

    /**
     * sample像个监狱检察官定期检测犯人
     * sample操作符定期扫描源Observable产生的结果，在指定的时间间隔范围内对源Observable产生的结果进行采样
     */
    private void sample() {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                try {
                    //前8个数字产生的时间间隔为1秒，后一个间隔为3秒
                    for (int i = 1; i < 9; i++) {
                        subscriber.onNext(i);
                        Thread.sleep(1000);
                    }
                    Thread.sleep(2000);
                    subscriber.onNext(9);
                    subscriber.onCompleted();
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        }).subscribeOn(Schedulers.newThread())
                .sample(2200, TimeUnit.MILLISECONDS)
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                        Log.d(TAG, "onCompleted: " + "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {

                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onNext: " + integer);
                    }
                });
    }

    /**
     * ignoreElements操作符
     * 忽略所有源Observable产生的结果，
     * 只把Observable的onCompleted和onError事件通知给订阅者。ignoreElements操作符适用于不太关心Observable产生的结果，
     * 只是在Observable结束时(onCompleted)或者出现错误时能够收到通知。
     */

    private void ignoreElements1() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .ignoreElements()
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {
                        Log.d(TAG, "onCompleted: " + "onCompleted");

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());

                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onNext: " + integer);
                    }
                });
    }

    /**
     * single
     * 操作类似booler,判读结果为真,执行条件后的语句
     * 否则执行外面的语句
     */
    private void single() {
        Observable.just(1, 2, 3, 4, 5, 6, 7, 8)
                .single(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer integer) {
                        return integer > 10;
                    }
                }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: " + e.getMessage());

            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "onNext: " + integer);
            }
        });
    }

    /**
     * oftype
     * 这个操作类似与filter
     * 但filter只过滤本数据,不过滤数据类型
     */
    private void oftype() {
        Observable.just(1, "hewldjfalsdj", true, 200L, 0.323f)
                .ofType(Float.class)
                .subscribe(new Subscriber<Float>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Float aFloat) {
                        Log.d(TAG, "onNext: " + aFloat);

                    }
                });
    }

    /**
     * debounce操作符
     * 这个结果其实对就是在指定时间后的操作对obserable进行观察,和timer类似,但功能比timer强大,类似debug;
     * debounce操作符对源Observable每产生一个结果后，如果在规定的间隔时间内没有别的结果产生，则把这个结果提交给订阅者处理，否则忽略该结果。
     * 值得注意的是，如果源Observable产生的最后一个结果后在规定的时间间隔内调用了onCompleted，那么通过debounce操作符也会把这个结果提交给订阅者。
     */
    private void debounce() {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                if (subscriber.isUnsubscribed()) return;
                try {
                    //产生结果的间隔时间分别为100、200、300...900毫秒
                    for (int i = 1; i < 10; i++) {
                        subscriber.onNext(i);
                        Thread.sleep(i * 100);
                    }
                    subscriber.onCompleted();
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        }).subscribeOn(Schedulers.newThread())
                .debounce(400, TimeUnit.MILLISECONDS)  //超时时间为400毫秒
                .subscribe(
                        new Action1<Integer>() {
                            @Override
                            public void call(Integer integer) {
                                System.out.println("Next:" + integer);
                            }
                        }, new Action1<Throwable>() {
                            @Override
                            public void call(Throwable throwable) {
                                System.out.println("Error:" + throwable.getMessage());
                            }
                        }, new Action0() {
                            @Override
                            public void call() {
                                System.out.println("completed!");
                            }
                        });
    }

    /**
     * window操作符非常类似于buffer操作符，
     * 区别在于buffer操作符产生的结果是一个List缓存，
     * 而window操作符产生的结果是一个Observable，
     * 订阅者可以对这个结果Observable重新进行订阅处理。
     */
    private void window() {
        Observable.interval(1, TimeUnit.SECONDS)
                .take(12)
                .window(5, TimeUnit.SECONDS)
                .subscribe(new Action1<Observable<Long>>() {
                    @Override
                    public void call(Observable<Long> longObservable) {
                        System.out.println("subdivide begin......");
                        longObservable.subscribe(new Action1<Long>() {
                            @Override
                            public void call(Long aLong) {
                                Log.d(TAG, "call: " + aLong);
                            }
                        });
                    }
                });
    }

    /**
     * scan
     * 操作符通过遍历源Observable产生的结果，
     * 依次对每一个结果项按照指定规则进行运算，
     * 计算后的结果作为下一个迭代项参数，
     * 每一次迭代项都会把计算结果输出给订阅者。
     */
    private void scan() {
        Observable.just(1, 2, 3, 4, 5)
                .scan(new Func2<Integer, Integer, Integer>() {
                    //实际上这里执行的是0+1,0+1+2,....0+1+...+5;
                    //0+1=sum,2=itme
                    @Override
                    public Integer call(Integer sum, Integer item) {
                        return sum + item;
                    }
                }).subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "onNext: " + integer);

            }
        });
    }

    /**
     * 将数据转变为list
     * 同理还有tomap
     */
    private void tolist() {
        Observable.just(12, 32343, 3, 2)
                .toList()
                .subscribe(new Subscriber<List<Integer>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Integer> integers) {
                        Log.d(TAG, "onNext: " + integers);
                    }
                });
    }

    /**
     * groupBy操作符
     * groupBy操作符是对源Observable产生的结果进行分组，
     * 形成一个类型为GroupedObservable的结果集，
     * GroupedObservable中存在一个方法为getKey()，
     * 可以通过该方法获取结果集的Key值（类似于HashMap的key)。
     */
    private void groupBy() {
        //发射10次,取余数,键值对
        Observable.interval(1, TimeUnit.MILLISECONDS)
                .take(10)
                .groupBy(new Func1<Long, Object>() {
                    @Override
                    public Object call(Long aLong) {
                        return aLong % 3;

                    }
                }).subscribe(new Action1<GroupedObservable<Object, Long>>() {
            @Override
            public void call(final GroupedObservable<Object, Long> result) {
                result.subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        Log.d(TAG, "key" + result.getKey() + ",value" + aLong);
                    }
                });
            }
        });
    }

    /**
     * donext方法 执行到某处然后停止
     * 相当于debug
     */

    private void doOnNext() {
        Observable.just(1, 2, 3)
                .doOnNext(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        if (integer > 1) {
                            throw new RuntimeException("到这里为止了");
                        }
                    }
                })
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());

                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onError: " + integer);

                    }
                });
    }

    /**
     * StartWith
     * 指定位置之前加入数据
     */
    private void startWith() {
        Observable.just(1, 2, 3)
                .startWith(4, 5, 6)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * merge
     * 合并多个Observables的发射物
     * 这里的合并是有线程之分的
     * 如果没有则按合并的顺序来分
     * merge(1,2)
     * Javadoc: merge(Iterable))
     * Javadoc: merge(Iterable,int))
     * Javadoc: merge(Observable[]))
     * Javadoc: merge(Observable,Observable)) (接受二到九个Observable)
     */
    private void merge() {
        Observable<Integer> odds = Observable.just(1, 3, 5).subscribeOn(AndroidSchedulers.mainThread());
        Observable<Integer> evens = Observable.just(2, 4, 6);

        Observable.merge(evens, odds)
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onNext: " + integer);
                    }
                });
    }

    /**
     * 后面变成list类型了
     */
    private void takelastbuffer() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .takeLastBuffer(2)
                .subscribe(new Subscriber<List<Integer>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Integer> integers) {
                        Log.d(TAG, "onNext: " + integers);
                    }
                });
    }

    /**
     * takelast
     * 显示最后几个数据
     * Javadoc: takeLast(int))
     * 还有一个操作符叫takeLastBuffer，
     * 它和takeLast类似，，唯一的不同是它把所有的数据项收集到一个List再发射，而不是依次发射一个。
     */
    private void takelast() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .takeLast(2)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * take
     * 后面的元素不显示,只显示指定类型的元素
     * Javadoc: take(long,TimeUnit))
     * Javadoc: take(long,TimeUnit,Scheduler))
     */
    private void take() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .take(4)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * skipLast
     * 去掉最后几个元素
     * 类比take,take是显示指定几个
     * 注意两者的区别
     */
    private void skipLast() {
        Observable.just(1, 2, 3, 4, 5, 6, 7)
                .skipLast(3)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * skip
     * skip的这个变体接受一个时长而不是数量参数。
     * 它会丢弃原始Observable开始的那段时间发射的数据，时长和时间单位通过参数指定。
     * Javadoc: skip(long,TimeUnit))
     * Javadoc: skip(long,TimeUnit,Scheduler))
     */
    private void skip() {
        Observable.just(1, 2, 3, 4, 5, 6)
                .skip(2)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * last
     * 和first对应
     * last
     */
    private void last() {
        Observable.just(1, 2, 3, 4)
                .last()
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * ignoreElements
     * 如果你不关心一个Observable发射的数据，但是希望在它完成时或遇到错误终止时收到通知，你可以对Observable使用ignoreElements操作符，它会确保永远不会调用观察者的onNext()方法。
     * 跳过订阅了
     */
    private void ignoreElements() {
        Observable.just(1, 2, 3, 4, 5)
                .ignoreElements()
                .subscribe(new Subscriber<Integer>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());

                    }

                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onError: " + integer);

                    }
                });
    }

    /**
     * first
     * First没有实现为一个返回Observable的过滤操作符，
     * 而是实现为一个在当时就发射原始Observable指定数据项的阻塞函数
     */
    private void first() {
        Observable.just(1, 2, 3, 4, 5)
                .first()
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * filter
     * 刷选数据
     * 只发射通过了谓词测试的数据项
     * Javadoc: filter(Func1))
     */
    private void filter() {
        Observable.just(1, 2, 3, 4, 5)
                .filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer integer) {
                        return integer <= 3 && integer > 1;
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
        return;
    }

    /**
     * elementat
     * 这个相当于类似java sub方法,只是这里指定到某个数据后就不会在订阅
     * Javadoc: elementAt(int))
     * Javadoc: elementAtOrDefault(int,T))
     */

    private void elementat() {
        Observable.just(1, 2, 3, 4, 5, 6, 7)
                .elementAt(2)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * distinct
     * 去重复的操作
     */
    private void distinct() {
        Observable.just(1, 3, 2, 1, 3, 4, 2, 21, 4, 3)
                .distinct()
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * flatmap
     * 我的理解是加工Obserable
     * FlatMap将一个发射数据的Observable变换为多个Observables，然后将它们发射的数据合并后放进一个单独的Observable
     * Javadoc: flatMap(Func1))
     * Javadoc: flatMap(Func1,int))
     */

    private void flatmap() {
        Observable.just("我是高手吗")
                .flatMap(new Func1<String, Observable<?>>() {
                    @Override
                    public Observable<?> call(String s) {
                        return Observable.just(s + "我知道你是高手了");

                    }
                })
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        Log.d(TAG, "call: " + o.toString());
                    }
                });
    }

    /**
     * buffer
     * 这个方法我不是很熟悉,到后面在来详细了解下
     * buffer操作符的功能:
     * 1：能一次性集齐多个结果到列表中，订阅后自动清空相应结果,直到完全清除
     * 2： 也可以周期性的集齐多个结果到列表中，订阅后自动清空相应结果,直到完全清除
     */

    private void buffer() {
        Observable.range(1, 6).buffer(6, 1)
                .subscribe(new Subscriber<List<Integer>>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e);
                    }

                    @Override
                    public void onNext(List<Integer> integers) {

                        Log.d(TAG, "onNext: " + integers);
                    }
                });
    }

    /**
     * timer
     * timer()：用于创建Observable，延迟发送一次。
     * interval()：用于创建Observable，跟TimerTask类似，用于周期性发送。
     * delay()：用于事件流中，可以延迟发送事件流中的某一次发送。
     */

    private void timer() {
        Observable.just(1, 2, 3, 4, 5).timer(2, TimeUnit.SECONDS)
                .subscribe(new Subscriber<Long>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        Log.d(TAG, "onNext: " + aLong);
                    }
                });
    }

    /**
     * Repeat
     * 创建一个发射特定数据重复多次的Observable
     * .repeat()接收到.onCompleted()事件后触发重订阅。
     * .retry()接收到.onError()事件后触发重订阅。
     * Javadoc: repeat())
     * Javadoc: repeat(long))
     * Javadoc: repeat(Scheduler))
     * Javadoc: repeat(long,Scheduler))
     */
    private void repeat() {
        Observable.just(1, 2, 3, 4, 5)
                .repeat(3)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                    }
                });
    }

    /**
     * Range
     * 类似fori,和from同理,不同just
     * 创建一个发射特定整数序列的Observable
     * Javadoc: range(int,int))
     * Javadoc: range(int,int,Scheduler))
     */
    private void range() {
        Observable.range(0, 10)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                        Toast.makeText(MainActivity.this, "" + integer, Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void just2() {
        Observable.just(1, 2, 3, 4)
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer + "");
                        //Toast.makeText(MainActivity.this, integer, Toast.LENGTH_SHORT).show();

                    }
                });
    }

    /**
     * Just将单个数据转换为发射那个数据的Observable。
     * Just类似于From，但是From会将数组或Iterable的数据取出然后逐个发射，而Just只是简单的原样发射，将数组或Iterable当做单个数据。
     */


    private void just() {
        Observable.just(items)
                .subscribe(new Subscriber<Integer[]>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Integer[] integers) {
                        Log.d(TAG, "onNext: " + integers + "");
                        Toast.makeText(MainActivity.this, integers + "", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    /**
     * interval
     * 适合做周期性的操作
     * Javadoc: interval(long,TimeUnit))
     * Javadoc: interval(long,TimeUnit,Scheduler))
     */

    private void interval() {
        final Observable<Long> longObservable = Observable.interval(5, TimeUnit.SECONDS);
        longObservable.subscribe(new Subscriber<Long>() {
            @Override
            public void onCompleted() {
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Long aLong) {
                Log.d(TAG, "onNext: " + aLong);
                //如果不做任何处理会一直在后台执行造成泄露


            }
        });
    }

    /**
     * from
     * from的响应方法
     * fromAction
     * fromCallable
     * fromFunc0
     * fromRunnable
     */
    private void from() {
        Observable<Integer> myObservable = Observable.from(items);
        myObservable.subscribe(
                new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.d(TAG, "call: " + integer);
                        Toast.makeText(MainActivity.this, integer + "", Toast.LENGTH_SHORT).show();
                    }
                });
        new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.d(TAG, "call: " + "throwable" + throwable.getMessage());
            }
        };
        new Action0() {
            @Override
            public void call() {
                System.out.println("Sequence complete");

            }
        };
    }

    /**
     * create方法
     */

    private void create() {
        //Observable 用户,调用者
        Observable<Integer> observable = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            // TODO: 2016/12/8 建议你在传递给create方法的函数中检查观察者的isUnsubscribed状态，以便在没有观察者的时候，让你的Observable停止发射数据或者做昂贵的运算。
            public void call(Subscriber<? super Integer> subscriber) {
                if (!subscriber.isUnsubscribed()) {
                    for (int i = 0; i < 5; i++) {
                        subscriber.onNext(i);
                    }
                }
            }
        });
        //subscribe订阅者
        //Subscriber 其实就是observer三个回调处理
        //“被观察者”制定了需要被某个观察者观察。
        observable.subscribe(new Subscriber<Integer>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onNext(Integer integer) {
                Toast.makeText(MainActivity.this, "集合数据为" + integer, Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onNext: " + integer);
            }
        });
    }
}
