package com.company;

import javax.swing.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main {

    public static void main(String[] args) {


        // skapar frame, knappar och possitionerar dom
        JFrame f=new JFrame("Sound Player");
        JButton sone=new JButton("One");
        JButton stwo=new JButton("Two");
        JButton sthree=new JButton("Three");
        JButton sfour=new JButton("Four");
        JButton sfive=new JButton("Five");
        JButton ssix=new JButton("Six");
        JButton sseven=new JButton("Seven");
        JButton seight=new JButton("Eight");
        JButton snine=new JButton("Nine");
        sone.setBounds(25,100,95,30);
        stwo.setBounds(150,100,95,30);
        sthree.setBounds(275,100,95,30);
        sfour.setBounds(25,150,95,30);
        sfive.setBounds(150,150,95,30);
        ssix.setBounds(275,150,95,30);
        sseven.setBounds(25,200,95,30);
        seight.setBounds(150,200,95,30);
        snine.setBounds(275,200,95,30);

        // ger ramen och knapparna bredd och höjd
        f.add(sone);
        f.add(stwo);
        f.add(sthree);
        f.add(sfour);
        f.add(sfive);
        f.add(ssix);
        f.add(sseven);
        f.add(seight);
        f.add(snine);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


        // väljer vilka filer som ska vara kopplade till knappen
        File one = new File("one.wav");
        File two = new File("two.wav");
        File three = new File("three.wav");
        File four = new File("four.wav");
        File five = new File("five.wav");
        File six = new File("six.wav");
        File seven = new File("seven.wav");
        File eight = new File("eight.wav");
        File nine = new File("nine.wav");



            // gör actionlistener till varje fil

        sone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound1(one);
            }
        });

        stwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound2(two);
            }
        });
        sone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound3(three);
            }
        });

        stwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound4(four);
            }
        });
        sone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound5(five);
            }
        });

        stwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound6(six);
            }
        });
        sone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound7(seven);
            }
        });

        stwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound8(eight);
            }
        });
        sone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlaySound9(nine);
            }
        });



    }

        // gör en try / catch för varje ljudfil.

    static void PlaySound1(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound2(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound3(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound4(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound5(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound6(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound7(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound8(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }
    static void PlaySound9(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch (Exception e)
        {

        }
    }

}
